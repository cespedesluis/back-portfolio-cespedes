package com.cv.luiscespedes.Controller;

import com.cv.luiscespedes.Entity.Experiencia;
import com.cv.luiscespedes.Interface.IExperienciaService;
import com.cv.luiscespedes.Repository.IExperienciaRepository;
import com.cv.luiscespedes.Repository.IPersonaRepository;

import java.util.List;

import javax.validation.Valid;

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
@RequestMapping(path = "/api/experiencia")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    @Autowired IExperienciaRepository iexpericiaRepository;
    @Autowired IPersonaRepository ipersonaRepository;
        
    
     @GetMapping ("/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
        
    }
    
    @PostMapping("/persona/{personaId}/crear")
   public Experiencia createExperiencia(@PathVariable (value = "personaId") Long personaId,
                                @Valid @RequestBody Experiencia experiencia) {
       return ipersonaRepository.findById(personaId).map(persona -> {
           experiencia.setPersona(persona);
           return iexpericiaRepository.save(experiencia);
       }).orElseThrow();
   }
   @PutMapping ("/persona/{personaId}/editar")
   public Experiencia ediExperiencia(@PathVariable (value = "personaId") Long personaId,
                               @Valid @RequestBody Experiencia experiencia) {
      return ipersonaRepository.findById(personaId).map(persona -> {
          experiencia.setPersona(persona);
          return iexpericiaRepository.save(experiencia);
      }).orElseThrow();
   }

   
    
    @DeleteMapping("/delete/{id}")
        public void deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);

    }
    
        
          
        
                                    
    
}
