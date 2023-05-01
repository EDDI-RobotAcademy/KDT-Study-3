<template>
    <div>
        <table>
            <tr>
                <td>Product ID</td>
                <td>
                    <input type="text" :value="product.productId" readonly/>
                </td>
            </tr>
            <tr>
                <td>Product Name</td>
                <td>
                    <input type="text" :value="product.productName" readonly/>
                </td>
            </tr> 
            <tr>
                <td>Product Price</td>
                <td>
                    <input type="text" :value="product.productPrice" readonly/>
                </td>
            </tr>  
            <tr>
                <td>Vendor</td>
                <td>
                    <input type="text" :value="product.vendor" readonly/>
                </td>
            </tr>         
            <tr>
                <td>Manufacture Date</td>
                <td>
                    <input type="text" :value="product.manufactureDate" readonly/>
                </td>
            </tr>
            <tr>
                <td>Expired Date</td>
                <td>
                    <input type="text" :value="product.localDateTime" readonly/>
                </td>
            </tr>  
            <tr>
                <td>Category</td>
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
<style>
    
</style>