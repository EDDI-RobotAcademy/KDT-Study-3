<template>
    <form @submit.prevent="onSubmit">
        <table>
            <tr>
                <th>Product Name</th>
                <td><input type="text" v-model="productName"></td>
            </tr>
            <tr>
                <th>Product Price</th>
                <td><input type="number" v-model="productPrice">$</td>
            </tr>
            <tr>
                <th>Vendor</th>
                <td><input type="text" v-model="vendor"></td>
            </tr>
            <tr>
                <th>Manufacture Date</th>
                <td><input type="date" v-model="manufactureDate"></td>
            </tr>
            <tr>
                <th>Category</th>
                <td><select type="text" v-model="category">
                    <!--TODO: 추후 store의 cagegorys의 category를 사용해서 v-for 사용하기-->
                    <option value> sellect category</option>
                    <option value="top">top</option>
                    <option value="pants">pants</option>
                    <option value="hat">hat</option>
                    <option value="shoes">shoes</option>
                </select></td>
            </tr>
        </table>
        <button type="submit">submit</button>|
        <button @click="()=>{this.$router.push('/product-list-page')}">cancel</button>
    </form>
</template>

<script>
export default {
    name: "ProductRegistForm",
    data() {
        return{
            productName:"",
            productPrice:0,
            vendor:"",
            manufactureDate:"",
            category:"all"
        }
    },
    methods: {
        onSubmit() {
            const {productName, productPrice, vendor, manufactureDate, category}=this
            this.$emit('submit', {productName, productPrice, vendor, manufactureDate, category})
        }
    }
}
</script>


<style scoped>

</style>