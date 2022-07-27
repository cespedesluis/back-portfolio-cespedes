package com.cv.luiscespedes.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "cursos")
public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idCursos;

    
    @Size (min=1,max=100,message="no tiene la longitud")
    private String curso;
    
    @Size (min=1,max=250,message="no tiene la longitud")
    private String data_curso;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String ano_curso;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String lugar_curso;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String ciudad_curso;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String prov_curso;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String pais_;

    
    @JsonProperty(access = Access.WRITE_ONLY)
    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn
    private Persona persona;
}
