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

@Setter @Getter
@Entity
@Table (name="educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idEducacion;
    
    

    @Size (min=1,max=400,message="no tiene la longitud")
   private String url_educa;

   @Size (min=1,max=50,message="no tiene la longitud")
   private String educa;
   
   @Size (min=1,max=150,message="no tiene la longitud")
   private String titulo;
   
   @Size (min=1,max=50,message="no tiene la longitud")
   private String ini_educa;
   
   @Size (min=1,max=50,message="no tiene la longitud")
   private String fin_educa;
   
   @Size (min=1,max=50,message="no tiene la longitud")
   private String ciudad_educa;
   
   @Size (min=1,max=50,message="no tiene la longitud")
   private String prov_educa;
   
   @Size (min=1,max=50,message="no tiene la longitud")
   private String pais_educa;

   @JsonProperty(access = Access.WRITE_ONLY)
   @ManyToOne (fetch = FetchType.LAZY,optional = false)
   @JoinColumn
   private Persona persona;
   
}
