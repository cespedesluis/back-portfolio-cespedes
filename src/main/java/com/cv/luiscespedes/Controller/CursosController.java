package com.cv.luiscespedes.Controller;

import java.util.List;

import javax.validation.Valid;

import com.cv.luiscespedes.Entity.Cursos;
import com.cv.luiscespedes.Interface.ICursosService;
import com.cv.luiscespedes.Repository.ICursosRepository;
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
@RestController
@RequestMapping(path  = "/api/cursos")
public class CursosController {
    @Autowired ICursosService icursosService;
    @Autowired ICursosRepository icursosRepository;
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    @GetMapping ("/traer")
   public List<Cursos> getCursos(){
       return icursosService.getCursos();
       
   }
   
   @PostMapping("/persona/{personaId}/crear")
   public Cursos createCursos(@PathVariable (value = "personaId") Long personaId,
                                @Valid @RequestBody Cursos cursos) {
       return ipersonaRepository.findById(personaId).map(persona -> {
           cursos.setPersona(persona);
           return icursosRepository.save(cursos);
       }).orElseThrow();
   }
   @PutMapping ("/persona/{personaId}/editar")
   public Cursos editCursos(@PathVariable (value = "personaId") Long personaId,
                               @Valid @RequestBody Cursos cursos) {
      return ipersonaRepository.findById(personaId).map(persona -> {
          cursos.setPersona(persona);
          return icursosRepository.save(cursos);
      }).orElseThrow();
   }

   
   
   @DeleteMapping("/delete/{id}")
       public void deleteCursos(@PathVariable Long id){
       icursosService.deleteCursos(id);
    }
    

}
