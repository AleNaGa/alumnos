package com.vedruna.alumnos.services;


import com.vedruna.alumnos.persistance.model.InfoContacto;

public interface InfoContactoServiceI {
    InfoContacto findByAlumno (String nombreAlumno);
}
