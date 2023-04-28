import Vue from "vue"
import Vuex from "vuex"

import mutations from "./mutations"
import states from "./states"
import actions from "./actions"

Vue.use(Vuex)

const ProductModule = {
    namespace: true,
    states,
    mutations,
    actions,
}

export default ProductModule
