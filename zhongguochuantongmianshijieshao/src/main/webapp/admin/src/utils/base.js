const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongguochuantongmianshijieshao/",
            name: "zhongguochuantongmianshijieshao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongguochuantongmianshijieshao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中国传统面食介绍网站"
        } 
    }
}
export default base
