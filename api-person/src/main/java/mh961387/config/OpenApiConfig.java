package mh961387.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Fullstack Person Crud")
                        .version("v1")
                        .description("API PERSON")
                        .termsOfService("https://github.com/mh961387/fullstack-person-crud")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/mh961387/fullstack-person-crud")
                        )
                );
    }
}
