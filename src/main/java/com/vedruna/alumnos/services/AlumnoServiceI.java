package com.vedruna.alumnos.services;

import java.util.List;

import com.vedruna.alumnos.DTO.AlumnoDTO;
import com.vedruna.alumnos.DTO.CreateAlumnoDTO;

public interface AlumnoServiceI {
    List <AlumnoDTO> findAllAlumnos();
    List<AlumnoDTO> findAlumnoByName(String name);
    AlumnoDTO findAlumnoById(int id);
    void saveAlumno(CreateAlumnoDTO alumno);
    void deleteAlumnoById(int id);

}
