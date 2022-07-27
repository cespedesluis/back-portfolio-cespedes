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
@Table (name="skill")
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idSkill;

    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String skill;

    @Size (min=1,max=50,message="no tiene la longitud")
    private String progress;
    
    
    @JsonProperty(access = Access.WRITE_ONLY)
    
@ManyToOne (fetch = FetchType.LAZY,optional = false)
@JoinColumn (name = "persona_id")
private Persona persona;

   
    




    
}
