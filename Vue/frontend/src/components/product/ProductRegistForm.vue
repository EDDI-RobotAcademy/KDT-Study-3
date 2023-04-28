<template>
    <form>
        <table>
            <tr>
                <th>Product Name</th>
                <td><input type="text"></td>
            </tr>
            <tr>
                <th>Product Price</th>
                <td><input type="number"></td>
            </tr>
            <tr>
                <th>Vendor</th>
                <td><input type="text" ></td>
            </tr>
            <tr>
                <th>Expiration Date</th>
                <td><input type="date" ></td>
            </tr>
            <tr>
                <th>Manufacture Date</th>
                <td><input type="date" ></td>
            </tr>
            <tr>
                <th>Category</th>
                <td><select type="text">
                    <!--TODO: 추후 store의 cagegorys의 category를 사용해서 v-for 사용하기-->
                    <option >전체</option>
                    <option >상의</option>
                    <option>하의</option>
                    <option>모자</option>
                    <option>신발</option>
                </select></td>
            </tr>
            <button>작성</button>
        </table>
    </form>
</template>

<script>
export default {
    name: "ProductRegistForm",
    date() {
    }
}
</script>

<style scoped>

</style>