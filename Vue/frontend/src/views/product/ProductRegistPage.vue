<template>
    <v-container>
        <h1>Product Regist</h1>
        <product-regist-form></product-regist-form>
    </v-container>
</template>

<script>
import ProductRegistForm from "@/components/product/ProductRegistForm.vue";
export default {
    name: "ProductRegistPage",
    components: {
        ProductRegistForm
    }
}
</script>

<style scoped>

</style>