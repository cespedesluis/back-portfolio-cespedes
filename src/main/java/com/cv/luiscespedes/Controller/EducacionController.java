package com.cv.luiscespedes.Controller;

import java.util.List;

import javax.validation.Valid;

import com.cv.luiscespedes.Entity.Educacion;
import com.cv.luiscespedes.Interface.IEducacionService;
import com.cv.luiscespedes.Repository.IEducacionRepository;
import com.cv.luiscespedes.Repository.IPersonaRepository;

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

@RequestMapping(path ="/api/educacion")
@RestController
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    @Autowired IEducacionRepository ieduacionRepository;
    @Autowired IPersonaRepository ipersonaRepository;

    
    
    @GetMapping ("/traer")
   public List<Educacion> getEducacion(){
       return ieducacionService.getEducacion();
       
   }
   @PostMapping("/persona/{personaId}/crear")
   public Educacion cratePortfolio(@PathVariable (value = "personaId") Long personaId,
                                @Valid @RequestBody Educacion educacion) {
       return ipersonaRepository.findById(personaId).map(persona -> {
           educacion.setPersona(persona);
           return ieduacionRepository.save(educacion);
       }).orElseThrow();
   }
   @PutMapping ("/persona/{personaId}/editar")
   public Educacion editEducacion(@PathVariable (value = "personaId") Long personaId,
                               @Valid @RequestBody Educacion educacion) {
      return ipersonaRepository.findById(personaId).map(persona -> {
          educacion.setPersona(persona);
          return ieduacionRepository.save(educacion);
      }).orElseThrow();
   }

   
   
   @DeleteMapping("/delete/{id}")
       public void deleteEducacion(@PathVariable Long id){
       ieducacionService.deleteEducacion(id);
    }
    
              


}
