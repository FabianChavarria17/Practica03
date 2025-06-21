
package controller;

import com.Practica03.dominio.Arbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Practica03.repositorio.ArbolRepositorio;
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
