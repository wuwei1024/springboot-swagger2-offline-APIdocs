package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wuwei
 * @since 2018/8/6 13:16
 *
 * 1) Spring Boot中使用Swagger2构建在线RESTful API文档
 * 参考： http://blog.didispace.com/springbootswagger2/
 * 在线文档访问地址：http://localhost:8080/test/swagger-ui.html
 *
 * 2) 使用Swagger2Markup实现API离线文档的生成
 * 执行命令：mvn clean test
 * 生成的文档位置: target/asciidoc/html和target/asciidoc/pdf
 * 参考：https://github.com/Swagger2Markup/spring-swagger2markup-demo
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful API")
                .description("更多Spring Boot相关demo 请关注：https://github.com/wuwei1024")
                .termsOfServiceUrl("https://github.com/wuwei1024")
                .contact(new Contact("wuwei", "https://github.com/wuwei1024", "wuwei6891@gmail.com"))
                .version("1.0")
                .build();
    }
}
