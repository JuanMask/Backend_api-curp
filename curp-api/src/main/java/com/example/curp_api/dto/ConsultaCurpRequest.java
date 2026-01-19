package com.example.curp_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;




public class ConsultaCurpRequest {
    @NotBlank
    @Size(min = 18, max = 18)
    @Schema(
        description = "CURP de la persona",
        example ="GARC900101HDFRRL09"
    )
    private String curp;

    public String getCurp(){
        return curp.toUpperCase();
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
