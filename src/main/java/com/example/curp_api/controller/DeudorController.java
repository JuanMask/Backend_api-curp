package com.example.curp_api.controller;

import com.example.curp_api.dto.ConsultaCurpRequest;
import com.example.curp_api.dto.ConsultarCurpResponse;
import com.example.curp_api.service.DeudorService;

import jakarta.validation.Valid;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;




@RestController
@RequestMapping("/api/deudores")
@Tag(name = "Deudores", description= "Operaciones relacionadas con deudores")


public class DeudorController {
    private final DeudorService deudorService;

    public DeudorController (DeudorService deudorService){
        this.deudorService = deudorService;
    }



    @Operation(
        summary = "Consultar si una curp es deudor",
        description = "Devuelve true si la CURP esta registrada como dedudor"
    )
    @ApiResponses(value={
        @ApiResponse(responseCode = "200", description = "Consulta exitosa"),
        @ApiResponse(responseCode = "400", description = "Curp Inválida"),
        @ApiResponse(responseCode = "404", description = "CURP no encontrada")
    })

    @PostMapping("/consultar")
    public ConsultarCurpResponse consultar(@Valid @RequestBody ConsultaCurpRequest request) {
        boolean esDeudor = deudorService.esDeudor(request.getCurp());
        
        return new ConsultarCurpResponse(
            request.getCurp(),
            esDeudor
        );
    }
    
}
