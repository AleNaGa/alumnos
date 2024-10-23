package com.vedruna.alumnos.DTO;

import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.model.InfoContacto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateAlumnoDTO {
    public int idAlumno;
    public String nombre;
    public String apellidos;
    InfoContactoDTO infoContacto;

    public CreateAlumnoDTO(Alumno alumno){
        this.idAlumno = alumno.getIdAlumno();
        this.nombre = alumno.getNombre();
        this.apellidos = alumno.getApellidos();
        this.infoContacto = new InfoContactoDTO(alumno.getInfoContacto());
    }
    

}