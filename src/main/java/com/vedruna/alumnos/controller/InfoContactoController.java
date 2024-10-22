package com.vedruna.alumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.alumnos.persistance.model.InfoContacto;
import com.vedruna.alumnos.services.InfoContactoServiceI;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/infocontacto")
public class InfoContactoController {

    @Autowired
    private InfoContactoServiceI infoContactoService;
    
    @GetMapping("/find/{name}")
    public InfoContacto getAlumnoByName(@PathVariable String name) { // getAlumnoByName
       try{
           return infoContactoService.findByAlumno(name);
       } catch (Exception e) {
           return null;
       }
    }

}
