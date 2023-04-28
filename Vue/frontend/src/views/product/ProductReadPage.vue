<template lang="">
    <div>
        <h2>상품 정보 읽기</h2>
        <product-read-form/>
        <!-- name: 옆에 페이지 이름 써주세요-->
        <router-link :to="{ name: }">게시물 수정</router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: }">목록으로 돌아가기</router-link>

    </div>
</template>
<script>
export default {
    comments: {
        ProductReadForm
    },
    methods: {            
        },
    }
</script>
<style lang="">
    
</style>