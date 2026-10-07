package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class PaginaController {  

   @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "registrar";
    }

    @GetMapping("/app")
    public String pagina() {
        return "app";
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

    @GetMapping("/descarga")
    public String descarga() {
        return "descarga";
    }

    @GetMapping("/watch")
    public String watch() {
        return "watch";
    }

    @GetMapping("/exclusivos")
    public String exclusivos() {
        return "exclusivos";
    }

}
