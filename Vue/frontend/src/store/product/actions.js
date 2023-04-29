import axiosInst from "@/utility/axiosInst"
import { REQUEST_PRODUCT_TO_SPRING } from "./mutation-types"

export default {
    requestProductToSpring ({commit}, productId) {
        return axiosInst.get(`/jpa-product/${productId}`)
        .then((res) => {
            commit(REQUEST_PRODUCT_TO_SPRING, res.data)
        })
    },
    requestProductListToSpring ({ commit }) {
        return axiosInst.get('/jpa-product/list')
            .then((res) => {
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
            })
    },
}