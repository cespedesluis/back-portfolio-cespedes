
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

@Table(name = "experiencia")
public class Experiencia implements Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long idExperiencia;
    
    @Size (min=1,max=100,message="no tiene la longitud")
    private String trabajo;
     
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String ini_trabajo;
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String fin_trabajo;
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String cargo_trabajo;
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String ciudad_trabajo;
     
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String prov_trabajo;
     
    @Size (min=1,max=50,message="no tiene la longitud")
    private String pais_trabajo;
     
     
  
    @Size (min=1,max=400,message="no tiene la longitud")
    private String url_trabajo;

    @JsonProperty(access = Access.WRITE_ONLY)

    @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn
    private Persona persona;
  
    


}
