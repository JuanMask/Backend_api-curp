package com.example.curp_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;


public class ConsultarCurpResponse {

    @Schema(
        description = "Indica si la CURP es deudor",
        example = "true"
    )
    private String curp;
    private boolean deudor;

    public ConsultarCurpResponse(String curp, boolean deudor){
        this.curp = curp;
        this.deudor = deudor;
    }

    public String getCurp(){
        return curp;
    }

    public boolean isDeudor(){
        return deudor;
    }
}
