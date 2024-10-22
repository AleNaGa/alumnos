package com.vedruna.alumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.services.AlumnoServiceI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {
    
    @Autowired
    private AlumnoServiceI alumnoService;

    @GetMapping
    public List<Alumno> getAlumnos() { // getAlumnos
       try{
               return alumnoService.findAllAlumnos();
       } catch (Exception e) {
           return null;
       }
    }
    
    @GetMapping("/nombre/{name}")
    public Alumno getAlumnoByName(@PathVariable String name) {
       try{
            return alumnoService.findAlumnoByName(name);
       } catch (Exception e) {
           return null;
       }
    }
    
    @PostMapping("/insert")
    public String addAlumno(@RequestBody Alumno nuevoAlumno){
        try{
            alumnoService.saveAlumno(nuevoAlumno);
            return "Alumno insertado";
        }catch(Exception e){
            return "Alumno no insertado" + e.getMessage();
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAlumno(@PathVariable int id){

        try{
        alumnoService.deleteAlumnoById(id);
        return "Alumno eliminado";
        }catch(Exception e){
            return "Alumno no eliminado error: " + e.getMessage();
        }
    }
    
}
