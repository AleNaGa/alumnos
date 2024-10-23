package com.vedruna.alumnos.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.alumnos.persistance.model.Alumno;

public interface AlumnoRepositoryI extends JpaRepository<Alumno, Integer> {

    List<Alumno> findAll();
    List<Alumno> findByNombre(String nombre);
    Alumno findById(int id);
    void deleteById(int id);
}
