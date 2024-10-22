package com.vedruna.alumnos.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.alumnos.persistance.model.Alumno;

public interface AlumnoRepositoryI extends JpaRepository<Alumno, Integer> {

    Alumno findByNombre(String nombre);
    void deleteById(int id);
}
