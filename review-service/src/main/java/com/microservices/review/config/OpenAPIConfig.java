package com.microservices.review.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI reviewServiceAPI() {
        return new OpenAPI()
                .info(new Info().title("Review Service API")
                        .description("This is the Rest API for Review Service")
                        .version("v0.0.1")
                        .license(new License().name("apache 2.0")));
    }
}
