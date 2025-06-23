/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica03.service.impl;

import com.Practica03.dominio.Arbol;
import com.Practica03.repositorio.ArbolRepositorio;
import com.Practica03.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 *
 * @author fabia
 */
@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolRepositorio arbolRepositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles() {
        // Aquí podrías filtrar si quieres mostrar solo árboles activos si tuvieras ese campo
        return arbolRepositorio.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return arbolRepositorio.findById(arbol.getId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolRepositorio.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        arbolRepositorio.deleteById(arbol.getId());
    }
}
