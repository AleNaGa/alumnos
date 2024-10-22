package com.vedruna.alumnos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.model.InfoContacto;
import com.vedruna.alumnos.persistance.repository.InfoContactoRepositoryI;


@Service
public class InfoContactoServiceImpl implements InfoContactoServiceI {

    @Autowired
    private InfoContactoRepositoryI infoRepo;

    @Autowired
    private AlumnoServiceI alumnoServiceI;
    @Override
    public InfoContacto findByAlumno(String nombre) {
        Alumno alumno = alumnoServiceI.findAlumnoByName(nombre);
        int id = alumno.getIdAlumno();
        return infoRepo.findByalumno_idAlumno(id);
    }
    
}
