package com.example.curp_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/* import org.springframework.cglib.core.Local; */

@Entity
@Table(
    name= "deudores"/* ,
    schema = "catalogo" */
)

public class Deudor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 18, nullable = false, unique = true)
    private String curp;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean status;

    @Column(name ="fecha_registro")
    private LocalDateTime fechaRegistro;

    // Constructor
    public Deudor(){

    }
   
//Gettesr y Setters
     public Integer getId(){
        return id;
    }

    public String getCurp(){
        return curp;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Boolean getstatus(){
        return status;
    }

    public void setstatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getFechaRegistro(){
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    

}

