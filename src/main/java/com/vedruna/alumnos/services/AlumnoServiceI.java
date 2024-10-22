package com.vedruna.alumnos.services;

import java.util.List;

import com.vedruna.alumnos.persistance.model.Alumno;

public interface AlumnoServiceI {
    List <Alumno> findAllAlumnos();
    Alumno findAlumnoByName(String name);
    void saveAlumno(Alumno alumno);
    void deleteAlumnoById(int id);
}
