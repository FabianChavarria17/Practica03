
package com.Practica03.controller;

import com.Practica03.repositorio.ArbolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

   @Autowired
    private ArbolRepositorio arbolRepo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("arboles", arbolRepo.findAll());
        return "index"; 
    }
}

