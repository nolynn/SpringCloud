# Cloud-zuul做请求转发和分配

### 启动指南
    1.首先启动EurekaServiceApplication
    2.其次分别启动 ProviderUserApplication 和 ProviderOrgApplication 服务
    3.启动 ZuulApplication
    4. 打开网址访问 http://localhost:8769/api-a/hi?name=forezp 请求到了用户微服务上的接口
    4. 打开网址访问 http://localhost:8769/api-b/hi?name=forezp 请求到了组织微服务上的接口

