package com.cv.luiscespedes.Controller;

import com.cv.luiscespedes.Entity.Persona;
import com.cv.luiscespedes.Interface.IPersonaService;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolioluiscespedes.web.app",maxAge = 3600)
@RestController
@RequestMapping(path = "/api/persona")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping ("/traer")
    public  List<Persona> getPersona(){
        return ipersonaService.getPersona();
        
    }

    
    @PostMapping("/crear")
    public Persona createPersona(@RequestBody Persona persona){

        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @DeleteMapping("/delete/{id}")
        public void deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
    }
    
@PutMapping ("/editar")
public Persona editarPersona(@RequestBody Persona persona){
    ipersonaService.editPersona(persona);
    return persona;
}
                                       


                                            
                                           
        }

    

               