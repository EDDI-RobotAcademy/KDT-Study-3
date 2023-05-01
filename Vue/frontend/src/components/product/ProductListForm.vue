<template>
    <div>
        <h3>Product List</h3>
        <table>
            <tr>
                <th style="text-align: center; width: 5%">product Number</th>
                <th style="text-align: center; width: 50%">product Name</th>
                <th style="text-align: center; width: 10%">product Price</th>
                <th style="text-align: center; width: 35%">Registration Date</th>
            </tr>
            <tr v-if="!products || (Array.isArray(products) && products.length === 0)">
                <td colspan="4">
                    현재 등록된 상품이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="(product, index) in products" :key="index">
                <td style="text-align: center">
                    {{ product.productId }}
                </td>
                <td align="center">
                    <router-link :to="{
                        name: 'ProductReadPage',
                        params: { productId: product.productId.toString()}
                    }">
                    {{ product.productName }}
                    </router-link>
                </td>
                <td style="text-align: center">
                    {{ product.productPrice }}
                </td>
                <td style="text-align: center">
                    {{ product.createDate }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    props: {
        products: {
            type: Array
        }
    }
}
</script>

<style lang="">
    
</style>