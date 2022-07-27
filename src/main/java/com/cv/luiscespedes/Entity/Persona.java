package com.cv.luiscespedes.Entity;








import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "persona")
public class Persona implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;


    @Size (min=1,max=50,message="no tiene la longitud")
    private String nombre;
    

    @Size (min=1,max=50,message="no tiene la longitud")
    private String apellido;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String fecha_nac;
    

    @Size (min=1,max=50,message="no tiene la longitud")
    private String ciudad_nac;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String prov_nac;
    
    @Size (min=1,max=50,message="no tiene la longitud")
    private String pais_nac;
    
    @Size (min=1,max=2000,message="no tiene la longitud")
    private String acerca_mi;
    
    @Size (min=1,max=500,message="no tiene la longitud")
    private String url_face;
    
    @Size (min=1,max=500,message="no tiene la longitud")
    private String url_baner;

    @Size (min=1,max=200,message="no tiene la longitud")
    private String direccion;

    @Size (min=1,max=100,message="no tiene la longitud")
    private String email;

    @Size (min=1,max=50,message="no tiene la longitud")
    private String telefono;

    @Size (min=1,max=50,message="no tiene la longitud")
	private String nombre_dev;
  

           
        @OneToMany(mappedBy = "persona")
        private Set<Skill> skills = new HashSet<>();


        

        @OneToMany(mappedBy = "persona")
        private Set<Portfolio> portfolios = new HashSet<>();
    
        @OneToMany(mappedBy = "persona")
        private Set<Experiencia> experiencias = new HashSet<>();

        @OneToMany(mappedBy = "persona")
        private Set<Educacion> educacions= new HashSet<>();

        @OneToMany(mappedBy = "persona")
        private Set<Cursos> cursoss= new HashSet<>();

        @OneToOne(mappedBy = "persona")
        private Login login;



      

       
    

        
}
