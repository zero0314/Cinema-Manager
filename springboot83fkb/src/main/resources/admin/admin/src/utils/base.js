const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot83fkb/",
            name: "springboot83fkb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot83fkb/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "电影购票平台小程序"
        } 
    }
}
export default base
