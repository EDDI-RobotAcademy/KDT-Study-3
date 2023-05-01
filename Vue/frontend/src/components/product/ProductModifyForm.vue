<template>
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>Product ID</td>
                    <td>
                        <input type="text" :value="product.productId" disabled/>
                    </td>
                </tr> 
                <tr>
                    <td>Product Name</td>
                    <td>
                        <input type="text" :value="product.productName" disabled/>
                    </td>
                </tr> 
                <tr>
                    <td>Product Price</td>
                    <td>
                        <input type="number" v-model="productPrice" />
                    </td>
                </tr>  
                <tr>
                    <td>Vendor</td>
                    <td>
                        <input type="text" v-model="vendor" />
                    </td>
                </tr>  
                <tr>
                    <td>Manufacture Date</td>
                    <td>
                        <input type="date" :value="product.manufactureDate" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>Expired Date</td>
                    <td>
                        <input type="text" :value="product.localDateTime" disabled/>
                    </td>
                </tr>    
                <tr>
                    <td>Category</td>
                    <td>
                        <td>
                        <select type="text" v-model="category">
                            <option value> sellect category</option>
                            <option value="top">top</option>
                            <option value="pants">pants</option>
                            <option value="hat">hat</option>
                            <option value="shoes">shoes</option>
                        </select>
                        </td>
                    </td>
                </tr>            
            </table>

            <div>
                <button type="submit">Completion</button>
                <router-link
                :to = "{
                    name: 'ProductReadPage',
                    params: { productId: product.productId.toString() },
                }">To Read Page
                </router-link>
            </div>
        </form>
    </div>
</template>

<script>
export default {
    props: {
        product: {
            type: Object,
            required: true,
        },
    },
    data() {
        return {
            productName: "",
            productPrice: "",
            vendor: "",
            manufactureDate: "",
            category: ""
        };
    },
    created(){
        this.productName = this.product.productName;
        this.productPrice = this.product.productPrice;
        this.vendor = this.product.vendor;
        this.manufactureDate = this.product.manufactureDate;
        this.category = this.product.category;
    },
    methods: {
        onSubmit() {
            const {productName, productPrice, vendor, category} = this
            this.$emit('submit', {productName, productPrice, vendor, category});
        },
    },
};
</script>

<style></style>