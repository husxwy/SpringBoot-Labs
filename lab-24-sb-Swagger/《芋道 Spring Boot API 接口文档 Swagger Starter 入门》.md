<http://www.iocoder.cn/Spring-Boot/Swagger-Starter/?github>

# [芋道 Spring Boot API 接口文档 Swagger Starter 入门](https://www.iocoder.cn/Spring-Boot/Swagger-Starter/)

http://127.0.0.1:8080/swagger-ui/

 总阅读量:3679次

摘要: 原创出处 http://www.iocoder.cn/Spring-Boot/Swagger-Starter/ 「芋道源码」欢迎转载，保留摘要，谢谢！

- [1. 概述](http://www.iocoder.cn/Spring-Boot/Swagger-Starter/)
- [2. 快速体验](http://www.iocoder.cn/Spring-Boot/Swagger-Starter/)
- [3. 自定义配置](http://www.iocoder.cn/Spring-Boot/Swagger-Starter/)
- [4. 自定义 Starter](http://www.iocoder.cn/Spring-Boot/Swagger-Starter/)
- [666. 彩蛋](http://www.iocoder.cn/Spring-Boot/Swagger-Starter/)

------

------

# 1. 概述

周末，**不讲武德**的狗芳跟我说，Swagger 官方 Starter 出来了，可以**自动配置**，真的香！

我拍了拍他的🐶头，这都出来四个月了，哥一早就体验过，并没有想象中的好用。

![SpringFox 3.0.0 发布](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/01.png)

狗芳表示**不服**，为什么不好用？

我**又**拍了拍他的🐶头，虽然提供了**自动配置**的功能，但是并未提供常用的**配置项**。

> 友情提示：对 Swagger 不了解的胖友，可以阅读下我写的[《芋道 Spring Boot API 接口文档 Swagger 入门》](http://www.iocoder.cn/Spring-Boot/Swagger/?self)文章，好看到爆炸~

# 2. 快速体验

我们先来快速体验下 Swagger 官方 Starter，体验下其提供的自动配置的功能。

新建一个示例项目，最终代码会如下图：

![示例项目](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/11.png)

> 良心艿：完整的代码，胖友可以访问 https://github.com/YunaiV/SpringBoot-Labs/tree/master/lab-24/lab-24-apidoc-swagger 地址。
>
> 嘿嘿~给个 star 噢！

## 2.1 引入依赖

在 [`pom.xml`](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/pom.xml) 文件中，引入 `springfox-boot-starter` 的依赖。



```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.11.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>lab-24-apidoc-swagger-starter</artifactId>

    <dependencies>
        <!-- 实现对 Spring MVC 的自动配置 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- 实现对 Swagger 的自动配置 -->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-boot-starter</artifactId>
            <version>3.0.0</version>
        </dependency>
    </dependencies>

</project>
```



**注意**，最低支持使用 SpringBoot 版本为 **2.2+** 。

> 版本差异：是否使用 Starter 的依赖对比如下：
>
> ![依赖对比](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/12.png)

## 2.2 示例代码

下面，我们来编写用于展示 Swagger 功能的示例代码，和是否使用 Starter **并没有任何差别**。

① 创建 [UserController](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/controller/UserController.java) 类，添加相应的 Swagger 注解。代码如下：



```
@RestController
@RequestMapping("/users")
@Api(tags = "用户 API 接口")
public class UserController {

    @GetMapping("/list")
    @ApiOperation(value = "查询用户列表", notes = "目前仅仅是作为测试，所以返回用户全列表")
    public List<UserVO> list() {
        // 查询列表
        List<UserVO> result = new ArrayList<>();
        result.add(new UserVO().setId(1).setUsername("yudaoyuanma"));
        result.add(new UserVO().setId(2).setUsername("woshiyutou"));
        result.add(new UserVO().setId(3).setUsername("chifanshuijiao"));
        // 返回列表
        return result;
    }

    @GetMapping("/get")
    @ApiOperation("获得指定用户编号的用户")
    @ApiImplicitParam(name = "id", value = "用户编号", paramType = "query", dataTypeClass = Integer.class, required = true, example = "1024")
    public UserVO get(@RequestParam("id") Integer id) {
        // 查询并返回用户
        return new UserVO().setId(id).setUsername(UUID.randomUUID().toString());
    }

    @PostMapping("add")
    @ApiOperation("添加用户")
    public Integer add(UserAddDTO addDTO) {
        // 插入用户记录，返回编号
        Integer returnId = UUID.randomUUID().hashCode();
        // 返回用户编号
        return returnId;
    }

    @PostMapping("/update")
    @ApiOperation("更新指定用户编号的用户")
    public Boolean update(UserUpdateDTO updateDTO) {
        // 更新用户记录
        Boolean success = true;
        // 返回更新是否成功
        return success;
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除指定用户编号的用户")
    @ApiImplicitParam(name = "id", value = "用户编号", paramType = "query", dataTypeClass = Integer.class, required = true, example = "1024")
    public Boolean delete(@RequestParam("id") Integer id) {
        // 删除用户记录
        Boolean success = false;
        // 返回是否更新成功
        return success;
    }

}
```



- [UserAddDTO](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/dto/UserAddDTO.java)
- [UserUpdateDTO](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/dto/UserUpdateDTO.java)
- [UserVO](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/vo/UserVO.java)

② 创建 [Application](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/Application.java) 类，用于 SpringBoot 应用的启动。代码如下：



```
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
```



## 2.3 简单测试

一切准备就绪，执行 Application 启动 SpringBoot 应用。

使用浏览器，访问 http://127.0.0.1:8080/swagger-ui/ 地址，进入 Swagger UI 界面。如下图所示：

> 版本差异：新版本的 Swagger UI 界面的地址，**是 `/swagger-ui/`**，而不是老版本的 `/swagger-ui.html`。

![Swagger UI 界面](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/13.png)

如此，我们已经完成了 Swagger 的快速集成与体验，还是非常方便。

# 3. 自定义配置

当我们想进行 Swagger 接口文档的**自定义**时，例如说修改 `title` 标题、`description` 描述等等信息时，却发现官方 Starter 并未提供对应的配置项。如下图所示：

![配置项](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/21.png)

这就导致，我们不得不创建 Configuration 类，进行自定义配置。下面，我们来演示下。

## 3.1 SwaggerConfiguration

创建 [SwaggerConfiguration](https://github.com/YunaiV/SpringBoot-Labs/blob/master/lab-24/lab-24-apidoc-swagger-starter/src/main/java/cn/iocoder/springboot/lab24/config/SwaggerConfiguration.java) 类，设置自定义的 `title` 标题、`description` 描述等等信息。代码如下：



```
@Configuration
// @EnableSwagger2 无需使用该注解
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        // 创建 Docket 对象
        return new Docket(DocumentationType.SWAGGER_2) // 文档类型，使用 Swagger2
                .apiInfo(this.apiInfo()) // 设置 API 信息
                // 扫描 Controller 包路径，获得 API 接口
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.iocoder.springboot.lab24.controller"))
                .paths(PathSelectors.any())
                // 构建出 Docket 对象
                .build();
    }

    /**
     * 创建 API 信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试接口文档示例")
                .description("我是一段描述")
                .version("1.0.0") // 版本号
                .contact(new Contact("芋艿", "http://www.iocoder.cn", "zhijiantianya@gmail.com")) // 联系人
                .build();
    }

}
```



> 版本差异：在使用官方 Starter 时，我们并不需要添加 `@EnableSwagger2` 注解，声明开启 Swagger 的功能。

## 3.2 简单测试

重启启动 SpringBoot 应用，访问 Swagger UI 界面，查看自定义配置是否生效。如下图所示：

![Swagger UI 界面](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/22.png)

成功~

# 4. 自定义 Starter

因为官方 Starter 提供的配置项**较少**，所以艿艿建议可以在其的基础之上，**自定义一个公司的 Swagger Starter**，提供更多自定义的配置项。

例如说，艿艿在自己的 [onemall](https://github.com/YunaiV/onemall/) 开源项目中，自定义了 [`mall-spring-boot-starter-swagger`](https://github.com/YunaiV/onemall/tree/master/common/mall-spring-boot-starter-swagger) 库。比较简单，胖友一看就明白，就不详细讲解代码。如下图所示：

![自定义 Swagger Starter](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/31.png)

这样，我们在 Web 项目中使用时，只需要引入 `mall-spring-boot-starter-swagger` 依赖，添加几行 Swagger 配置即可。如下图所示：

![具体使用](https://static.iocoder.cn/images/Spring-Boot/2019-11-23/32.png)

# 666. 彩蛋

至此，我们已经完成 Swagger 官方 Starter 的学习，一起来简单总结下：

- 通过在项目中引入 `springfox-boot-starter` 依赖，可以实现 Swagger 的自动配置，非常方便的完成它的集成。
- 由于 Swagger 官方 Starter 提供的自定义配置项较少，所以建议在其的基础上，进行二次开发，实现适合公司或者团队的 Swagger Starter。

------

End~继续抠脚。

我是艿艿，一个每天徘徊在**煞笔**与**牛啤**的死胖子。
