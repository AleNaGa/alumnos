package com.vedruna.alumnos.DTO;

import com.vedruna.alumnos.persistance.model.Alumno;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AlumnoDTO {
    public int idAlumno;
    public String nombre;
    public String apellidos;

    public AlumnoDTO(Alumno al) {
        this.idAlumno = al.getIdAlumno();
        this.nombre = al.getNombre();
        this.apellidos = al.getApellidos();
    }
    

}
