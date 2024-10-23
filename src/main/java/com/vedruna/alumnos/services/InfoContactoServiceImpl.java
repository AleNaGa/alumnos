package com.vedruna.alumnos.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.alumnos.DTO.AlumnoDTO;

import com.vedruna.alumnos.DTO.InfoContactoDTO;
import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.model.InfoContacto;
import com.vedruna.alumnos.persistance.repository.AlumnoRepositoryI;
import com.vedruna.alumnos.persistance.repository.InfoContactoRepositoryI;


@Service
public class InfoContactoServiceImpl implements InfoContactoServiceI {

    @Autowired
    private InfoContactoRepositoryI infoRepo;
    @Autowired
    private AlumnoServiceI alumnoServiceI;
    @Autowired
    private AlumnoRepositoryI alumnoRepo;

    @Override
    public List<InfoContactoDTO> findByAlumno(String nombreAlumno) {
       List<Alumno> alumnos = alumnoRepo.findByNombre(nombreAlumno);
        List<InfoContactoDTO> list = new ArrayList<>();
       for (Alumno al : alumnos) {
           list.add(new InfoContactoDTO(al.getInfoContacto()));
       }
       return list;
    }
    @Override
    public void saveInfoContacto(InfoContactoDTO infoContactoDTO) {
      InfoContacto infoModel = new InfoContacto();
      infoModel.setDireccion(infoContactoDTO.getDireccion());
      infoModel.setIdInfoContacto(infoContactoDTO.idInfoContacto);
      infoModel.setAlumno(alumnoRepo.findById(infoContactoDTO.idAlumno));
      infoModel.setTelefono(infoContactoDTO.getTelefono());
      infoRepo.save(infoModel);
    }

    public String test() {
      return "test";
    }
    
}
