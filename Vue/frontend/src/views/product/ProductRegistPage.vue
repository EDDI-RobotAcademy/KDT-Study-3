<template>
    <v-container>
        <h1>Product Regist</h1>
        <product-regist-form @submit="onSubmit"></product-regist-form>
    </v-container>
</template>

<script>
import { mapActions } from 'vuex';
import ProductRegistForm from "@/components/product/ProductRegistForm.vue";
const productModule = 'productModule'

export default {
    name: "ProductRegistPage",
    components: {
        ProductRegistForm
    },
    methods: {
        ...mapActions(
            productModule, ['requestRegistProductToSpring']
        ),
        async onSubmit(payload) {
            const product = await this.requestRegistProductToSpring(payload)
            await this.$router.push({
                name: 'ProductReadPage',
                params: {productId: product.data.productId.toString()}
            })
        }
    }
}
</script>

<style scoped>

</style>