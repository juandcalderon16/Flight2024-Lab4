package com.example.flight2024;


import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api de Grstion de Vuelos")
                        .version("1.0")
                        .description("Documentacion de la API de vuelos para gestionar informacion de vuelos")
                );
    }

}
