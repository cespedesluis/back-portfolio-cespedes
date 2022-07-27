package com.cv.luiscespedes.Entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table (name="usuario")
public class Login implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;


    @Size (min=1,max=200)
    private String email;

    @Size (min=1,max=20)
    private String password;

    @OneToOne
    @JsonProperty(access = Access.WRITE_ONLY)

  @JoinColumn
  private Persona persona;
   
}
