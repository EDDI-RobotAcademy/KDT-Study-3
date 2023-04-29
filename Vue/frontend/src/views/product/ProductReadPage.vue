<template>
    <div>
        <h2>상품 정보 읽기</h2>
        <product-read-form/>

        <router-link :to="{ name: 'ProductModifyPage', params: { productId }}">
            게시물 수정
        </router-link>
        <button @click="onDelete">
            삭제
        </button>
        <router-link :to="{ name:'product-list-page' }">
            돌아가기
        </router-link>
    </div>
</template>

<script>
import ProductReadForm from '@/components/ProductReadForm.vue';
import { mapActions, mapState } from 'vuex';

const productModule = 'productModule'

export default {
    components: {
        ProductReadForm
    },
    props: {
        productId: {
            type: String,
            required: true,
        }
    },
    computed: {
        ...mapState(productModule,['product'])
    },

    methods: {     
        ...mapActions(
            productModule, ['requestProductToSpring']
        ),
    },
    created() {
            this.requestProductToSpring(this.productId)
        },
    }
</script>

<style></style>