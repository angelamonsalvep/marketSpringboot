package com.angela.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class SaludoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Bienvenido a la Api de Angela";
    }
}