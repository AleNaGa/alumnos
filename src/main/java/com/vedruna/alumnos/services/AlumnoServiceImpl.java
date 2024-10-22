package com.vedruna.alumnos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.repository.AlumnoRepositoryI;


@Service
public class AlumnoServiceImpl implements AlumnoServiceI{

    @Autowired
    private AlumnoRepositoryI alumnoRepo;

    @Override
    public List<Alumno> findAllAlumnos() {
        return alumnoRepo.findAll();
        
    }

    @Override
    public Alumno findAlumnoByName(String name) {
        return alumnoRepo.findByNombre(name);
    }

    @Override
    public void saveAlumno(Alumno alumno) {
        alumnoRepo.save(alumno);
    }

    @Override
    public void deleteAlumnoById(int id) {
        alumnoRepo.deleteById(id);
    }
    
}
