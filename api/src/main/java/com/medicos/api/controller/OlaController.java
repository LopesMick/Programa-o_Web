package com.medicos.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class OlaController {

    @GetMapping
    public String olaMundo() {
        return "Olá Mundo!";
    }

    // Informar para o Spring que a classe OlaController é um controlador
    // Informar o endpoint do OlaController (mapeamento do endereço)
    // GET -> ...
}