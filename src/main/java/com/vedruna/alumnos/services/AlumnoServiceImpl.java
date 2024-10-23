package com.vedruna.alumnos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.alumnos.DTO.AlumnoDTO;
import com.vedruna.alumnos.DTO.CreateAlumnoDTO;
import com.vedruna.alumnos.DTO.InfoContactoDTO;
import com.vedruna.alumnos.persistance.model.Alumno;
import com.vedruna.alumnos.persistance.model.InfoContacto;
import com.vedruna.alumnos.persistance.repository.AlumnoRepositoryI;


@Service
public class AlumnoServiceImpl implements AlumnoServiceI{

    @Autowired
    private AlumnoRepositoryI alumnoRepo;

    @Override
    public List<AlumnoDTO> findAllAlumnos() {
        List<AlumnoDTO> list = new ArrayList<>();

        try{
            List <Alumno>listAlumnos = alumnoRepo.findAll();
            for (Alumno alumno : listAlumnos) {
                AlumnoDTO dto = new AlumnoDTO(alumno);
                list.add(dto);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return list;  
    }

    @Override
    public List<AlumnoDTO> findAlumnoByName(String name) {
        List<AlumnoDTO> list = new ArrayList<>();
        try{
            List <Alumno>listAlumnos = alumnoRepo.findByNombre(name);
            for (Alumno alumno : listAlumnos) {
                AlumnoDTO dto = new AlumnoDTO(alumno);
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return list;
    }

 

    @Override
    public void saveAlumno(CreateAlumnoDTO alumno) {
        Alumno newAlumno = new Alumno();
        newAlumno.setApellidos(alumno.getApellidos());
        newAlumno.setNombre(alumno.getNombre());
        newAlumno.setIdAlumno(alumno.getIdAlumno());
        if(alumno.getInfoContacto() != null){
            InfoContacto infoContacto = new InfoContacto();
           infoContacto.setAlumno(newAlumno);
           infoContacto.setIdInfoContacto(alumno.getInfoContacto().getIdInfoContacto());
           infoContacto.setTelefono(alumno.getInfoContacto().getTelefono());
           infoContacto.setDireccion(alumno.getInfoContacto().getDireccion());
           newAlumno.setInfoContacto(infoContacto);
        }try{
            alumnoRepo.save(newAlumno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAlumnoById(int id) {
        alumnoRepo.deleteById(id);
    }

    @Override
    public AlumnoDTO findAlumnoById(int id) {
        return new AlumnoDTO(alumnoRepo.findById(id));
    }
    
}
