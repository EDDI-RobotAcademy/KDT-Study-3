import Vue from 'vue'
import Vuex from 'vuex'

import mutations from "@/store/product/mutations"
import actions from "@/store/product/actions"
import states from "@/store/product/states"

Vue.use(Vuex)

const ProductModule = {
    namespace: true,
    states,
    mutations,
    actions,
}

export default ProductModule