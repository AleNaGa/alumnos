package com.vedruna.alumnos.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.model.InfoContacto;

public interface InfoContactoRepositoryI extends JpaRepository<InfoContacto, Integer> {

    InfoContacto findByalumno_idAlumno(int idAlumno);
}
