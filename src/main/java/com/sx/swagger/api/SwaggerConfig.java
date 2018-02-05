package com.sx.swagger.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: xyj
 * @Description:
 * @CreateTime: 2018/1/24 23:32
 * @Version:
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createUserInfo() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        Contact contact = new Contact("Swagger测试", "www.baidu.com", "semiwarm@163.com");
        ApiInfo apiInfo = new ApiInfo("API文档说明", "Swagger API文档", "V1.0", "", contact, "", "");
        docket.apiInfo(apiInfo);
        return docket;
    }
}
