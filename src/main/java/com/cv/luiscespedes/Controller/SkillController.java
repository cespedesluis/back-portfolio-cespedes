package com.cv.luiscespedes.Controller;


import com.cv.luiscespedes.Entity.Skill;
import com.cv.luiscespedes.Interface.ISkillService;
import com.cv.luiscespedes.Repository.IPersonaRepository;
import com.cv.luiscespedes.Repository.ISkillRepository;

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
@RequestMapping(path = "/api/skill")
@RestController
public class SkillController {
    @Autowired ISkillService iskillService;
    @Autowired ISkillRepository iskillRepository;
    @Autowired IPersonaRepository ipersonaRepository;
    
    @GetMapping ("/traer")
   public List<Skill> getSkill(){
       return iskillService.getSkill();
   }
        
  
   @PostMapping("/persona/{personaId}/crear")
   public Skill crearSkill(@PathVariable (value = "personaId") Long personaId,
                                @Valid @RequestBody Skill skill) {
       return ipersonaRepository.findById(personaId).map(persona -> {
           skill.setPersona(persona);
           return iskillRepository.save(skill);
       }).orElseThrow();
   }
   @PutMapping ("/persona/{personaId}/editar")
   public Skill editSkill(@PathVariable (value = "personaId") Long personaId,
                               @Valid @RequestBody Skill skill) {
      return ipersonaRepository.findById(personaId).map(persona -> {
          skill.setPersona(persona);
          return iskillRepository.save(skill);
      }).orElseThrow();
   }






   
   
   @DeleteMapping("/delete/{id}")
       public void deleteSkill(@PathVariable Long id){
       iskillService.deleteSkill(id);
      
    }
   
                                


}
