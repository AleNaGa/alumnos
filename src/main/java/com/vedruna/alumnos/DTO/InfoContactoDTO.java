package com.vedruna.alumnos.DTO;

import com.vedruna.alumnos.persistance.model.InfoContacto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InfoContactoDTO {

   public int idInfoContacto;
   public String direccion;
   public int telefono;
   public int idAlumno;

   public InfoContactoDTO(InfoContacto infoContacto){
       this.idInfoContacto = infoContacto.getIdInfoContacto();
       this.direccion = infoContacto.getDireccion();
       this.telefono = infoContacto.getTelefono();
       this.idAlumno = infoContacto.getAlumno().getIdAlumno();
   }
    
}
