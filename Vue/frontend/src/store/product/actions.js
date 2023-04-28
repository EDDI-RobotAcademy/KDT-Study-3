import axiosInst from "@/utility/axiosInst"
import { REQUEST_PRODUCT_TO_SPRING } from "./mutation-types"

export default {
    requestProductToSpring ({commit}, productId) {
        return axiosInst.get(`/ /${productId}`)
        .then((res) => {
            commit(REQUEST_PRODUCT_TO_SPRING, res.data)
        })
    },
}