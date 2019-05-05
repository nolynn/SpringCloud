# Cloud-zuul做请求转发和分配

### 启动指南
    1.首先启动EurekaServiceApplication
    2.其次分别启动 ProviderUserApplication 和 ProviderOrgApplication 服务
    3.启动 ZuulApplication
    4. 打开网址访问 http://localhost:8769/api-a/hi?name=forezp 请求到了用户微服务上的接口
    4. 打开网址访问 http://localhost:8769/api-b/hi?name=forezp 请求到了组织微服务上的接口

### 改造zuul zuul不仅只是路由，并且还能过滤，做一些安全验证。继续改造工程；
    1.保持启动，创建filter 继承 ZuulFilter 并重写方法
    2.拦截请求头做一些参数的校验
    3.访问链接测试 
                 http://localhost:8769/api-a/hi?name=forezp&token=22
                 http://localhost:8769/api-b/hi?name=forezp&token=22