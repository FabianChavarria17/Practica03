
package com.Practica03.service;

import com.Practica03.dominio.Arbol;
import java.util.List;


public interface ArbolService {
     
    public List<Arbol> getArboles(); 

    public Arbol getArbol(Arbol arbol);

    public void save(Arbol arbol);

    public void delete(Arbol arbol);
}


