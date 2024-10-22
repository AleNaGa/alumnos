package com.vedruna.alumnos.persistance.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table (name = "infocontacto")
public class InfoContacto implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idinfocontacto")
    private int idInfoContacto;

    @Column(name="direccion")
    private String direccion;

    @Column(name="telefono")
    private int telefono;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alumnos_idalumno", referencedColumnName = "idalumno")
    private Alumno alumno; 
    
}
