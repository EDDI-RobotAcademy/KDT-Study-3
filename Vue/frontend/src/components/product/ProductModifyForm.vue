<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>상품 번호</td>
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
                        <input type="text" v-model="productPrice" />
                    </td>
                </tr>  
                <tr>
                    <td>Vendor</td>
                    <td>
                        <input type="text" :v-model="product.vendor" />
                    </td>
                </tr>  
                <tr>
                    <td>Manufacture Date</td>
                    <td>
                        <input type="text" :value="product.manufactureDate" disabled/>
                    </td>
                </tr>  
                <tr>
                    <td>Category</td>
                    <td>
                        <input type="text" v-model="product.category" />
                    </td>
                </tr>            
            </table>

            <div>
                <button type="submit">Completion</button>
                <router-link
                :to = "{
                    name: 'ProductReadPage',
                    params: { productId: product.productId.toString() },
                }">Cancel
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
            this.$emit("submit", {productName, productPrice, vendor, category});
        },
    },
};
</script>

<style lang=""></style>