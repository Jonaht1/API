package com.turnos.complejo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Perro")
public class prueba {

    @GetMapping
    public String helloWorld() {
        return "Hola Lmp!";
    }

}

