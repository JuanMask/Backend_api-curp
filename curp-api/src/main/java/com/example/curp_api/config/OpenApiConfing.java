package com.example.curp_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API Consulta de deudores por busqueda de CURP",
        version = "1.0",
        description = "API para consultar si una CURP esta registrada como deudor"
    )
)

public class OpenApiConfing {
    
}
