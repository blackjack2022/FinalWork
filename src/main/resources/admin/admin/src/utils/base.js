const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot366n071w/",
            name: "springboot366n071w",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot366n071w/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园电动车租赁系统"
        } 
    }
}
export default base
