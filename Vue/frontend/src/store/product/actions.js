import axiosInst from "@/utility/axiosInst"
import {REQUEST_PRODUCT_LIST_TO_SPRING, REQUEST_PRODUCT_TO_SPRING} from "./mutation-types"

export default {
    requestProductToSpring ({commit}, productId) {
        return axiosInst.get(`/jpa-product/${productId}`)
        .then((res) => {
            commit(REQUEST_PRODUCT_TO_SPRING, res.data);
        });
    },
    requestProductListToSpring ({ commit }) {
        return axiosInst.get('/jpa-product/list')
            .then((res) => {
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data);
            });
    },
    requestRegistProductToSpring({}, payload) {
        const {productName, productPrice, vendor, manufactureDate, category} = payload
        return axiosInst.post('/jpa-product/register', {productName, productPrice, vendor, manufactureDate, category})
            .then((res) => {
                alert('Product registration success')
                return res
            })
            .catch(()=> {
                alert('ERROR!')
            })
    },
    requestProductModifyToSpring({}, payload){
        const { productId, productName, productPrice, vendor, category } = payload;

        return axiosInst.put(`/jpa-product/${productId}`, {productName, productPrice, vendor, category})
            .then((res) => {
                alert("상품 수정 성공!");
            })
            .catch(() => {
                alert("문제 발생!");
            });
    },
    requestDeleteProductToSpring ({}, productId) {
        return axiosInst.delete(`/jpa-product/${productId}`)
            .then((res) => {
                alert('삭제 성공!')
            })
            .catch(() => {
                alert('문제 발생!')
            })
    }
};
