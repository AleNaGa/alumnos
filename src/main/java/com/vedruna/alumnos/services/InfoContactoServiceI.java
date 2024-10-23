package com.vedruna.alumnos.services;


import java.util.List;

import com.vedruna.alumnos.DTO.InfoContactoDTO;
import com.vedruna.alumnos.persistance.model.InfoContacto;

public interface InfoContactoServiceI {
    List<InfoContactoDTO> findByAlumno (String nombreAlumno);
    void saveInfoContacto(InfoContactoDTO infoContactoDTO);
    String test();
}
