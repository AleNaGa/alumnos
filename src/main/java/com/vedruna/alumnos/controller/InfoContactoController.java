package com.vedruna.alumnos.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.alumnos.DTO.InfoContactoDTO;
import com.vedruna.alumnos.services.InfoContactoServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/infocontacto")
public class InfoContactoController {

    @Autowired
    InfoContactoServiceI infoContactoService;
    
    @GetMapping("/nombre/{name}")
    public List<InfoContactoDTO> getAlumnoByName(@PathVariable String name) { // getAlumnoByName
       try{
           List<InfoContactoDTO> infoContacto = infoContactoService.findByAlumno(name);
           return infoContacto;
       } catch (Exception e) {
           return null;
       }
    }
    @PostMapping("/insert")
    public String postMethodName(@RequestBody InfoContactoDTO infoContacto) {
        infoContactoService.saveInfoContacto(infoContacto);
        return "InfoContacto insertado";
    }
    
    @GetMapping("/test")
    public String getMethodName() {
        return infoContactoService.test();
    }
    

}
