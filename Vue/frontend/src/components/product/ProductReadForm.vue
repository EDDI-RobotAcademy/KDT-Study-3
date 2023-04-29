<template lang="">
    <div>
        <table>
            <tr>
                <td>상품명</td>
                <td>
                    <input type="text" :value="product.productName" readonly/>
                </td>
            </tr> 
            <tr>
                <td>상품가격</td>
                <td>
                    <input type="text" :value="product.productPrice" readonly/>
                </td>
            </tr>  
            <tr>
                <td>제조사</td>
                <td>
                    <input type="text" :value="product.vendor" readonly/>
                </td>
            </tr>         
            <tr>
                <td>제조일</td>
                <td>
                    <input type="text" :value="product.manufactureDate" readonly/>
                </td>
            </tr>  
            <tr>
                <td>상품 카테고리</td>
                <td>
                    <input type="text" :value="product.category" readonly/>
                </td>
            </tr>            
        </table>
    </div>
</template>
<script>
export default {
    name: "ProductReadForm",
    props: {
        product: {
            type: Object,
            required: true,
        }
    }
}
</script>
<style lang="">
    
</style>