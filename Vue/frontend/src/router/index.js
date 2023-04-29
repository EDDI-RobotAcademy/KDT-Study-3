import Vue from 'vue';
import VueRouter from 'vue-router';
import HomeView from '../views/HomeView.vue';

import ProductRegistPage from "@/views/product/ProductRegistPage.vue";
import ProductListPage from '@/views/product/ProductListPage.vue';
import ProductModifyPage from "@/views/product/ProductModifyPage.vue";
import ProductReadPage from "@/views/product/ProductReadPage.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/product-modify-page',
    name: "ProductModifyPage",
    component: ProductModifyPage,
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/product-list-page',
    name: 'ProductListPage',
    component: ProductListPage
  },
  {
    path: '/product-read-page',
    name: 'ProductReadPage',
    component: ProductReadPage
  },
  {
    path: '/product-regist-page',
    name: 'ProductRegistPage',
    component: ProductRegistPage
  },

]

const router = new VueRouter({
  routes
})

export default router
