import axiosInst from "@/utility/axiosInst"
import {REQUEST_PRODUCT_LIST_TO_SPRING, REQUEST_PRODUCT_TO_SPRING} from "./mutation-types"

export default {
    requestProductToSpring ({commit}, productId) {
        return axiosInst.get(`/ /${productId}`)
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
    requestRegistProductToSpring({}, payload) {
        const {productName, productPrice, vendor, menufactureDate, category} = payload
        return axiosInst.post('/jpa-product/register', {productName, productPrice, vendor, menufactureDate, category})
            .then((res) => {
                alert('Product registration success')
                return res
            })
            .catch(()=> {
                alert('ERROR!')
            })
    },

}