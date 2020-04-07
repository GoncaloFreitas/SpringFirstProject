package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryResource {

    @GetMapping("/categories")
    public String listCategories(){
        return "Lista de Categorias";
    }
}
