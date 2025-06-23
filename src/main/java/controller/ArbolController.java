/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package controller;

import com.Practica03.dominio.Arbol;
import com.Practica03.repositorio.ArbolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/arboles")
public class ArbolController{
    
    @Autowired
    ArbolRepositorio arbolRepo;
    
    @GetMapping
    public List<Arbol> listar(){
        return arbolRepo.findAll();
    }
}
