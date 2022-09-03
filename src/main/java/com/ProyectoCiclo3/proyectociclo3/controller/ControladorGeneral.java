package com.ProyectoCiclo3.proyectociclo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorGeneral {

    @GetMapping
    public String saludo() {
        return "Este es m primer Proyecto en la Web";
    }
}
