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
                    <td>상품명</td>
                    <td>
                        <input type="text" :value="product.productName" disabled/>
                    </td>
                </tr> 
                <tr>
                    <td>상품가격</td>
                    <td>
                        <input type="text" v-model="productPrice" />
                    </td>
                </tr>  
                <tr>
                    <td>제조사</td>
                    <td>
                        <input type="text" :v-model="product.vendor" />
                    </td>
                </tr>  
                <tr>
                    <td>제조일</td>
                    <td>
                        <input type="text" :value="product.manufactureDate" disabled/>
                    </td>
                </tr>  
                <tr>
                    <td>상품 카테고리</td>
                    <td>
                        <input type="text" v-model="product.category" />
                    </td>
                </tr>            
            </table>

            <div>
                <button type="submit">수정 완료</button>
                <router-link
                :to = "{
                    name: 'ProductReadPage',
                    params: { productId: product.productId.toString() },
                }">
                    수정 취소
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