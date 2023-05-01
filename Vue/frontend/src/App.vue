<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <div class="d-flex align-center">
        <v-btn @click="()=>this.$router.push('/')"  color="white">
          <v-img src="@/assets/logo.svg" max-height="30" max-width="30" contain/>
        <v-app-bar-title style="color:black">
          <span>STUDY-2-3</span>
        </v-app-bar-title>
        </v-btn>
      </div>
      <v-spacer></v-spacer>
    </v-app-bar>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    //
  }),
};
</script>
