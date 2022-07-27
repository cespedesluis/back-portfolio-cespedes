package com.cv.luiscespedes.Controller;

import java.util.List;

import javax.validation.Valid;

import com.cv.luiscespedes.Entity.Portfolio;
import com.cv.luiscespedes.Interface.IPortfolioService;
import com.cv.luiscespedes.Repository.IPersonaRepository;
import com.cv.luiscespedes.Repository.IPortfolioRepository;

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
@RequestMapping(path = "/api/portfolio")
@RestController
public class PortfolioController {
    @Autowired IPortfolioService iportfolioService;
    @Autowired IPortfolioRepository iportfolioRepository;
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    
    @GetMapping ("/traer")
   public List<Portfolio> getPortfolio(){
       return iportfolioService.getPortfolio();
       
   }
   @PostMapping("/persona/{personaId}/crear")
   public Portfolio cratePortfolio(@PathVariable (value = "personaId") Long personaId,
                                @Valid @RequestBody Portfolio portfolio) {
       return ipersonaRepository.findById(personaId).map(persona -> {
           portfolio.setPersona(persona);
           return iportfolioRepository.save(portfolio);
       }).orElseThrow();
   }
   @PutMapping ("/persona/{personaId}/editar")
   public Portfolio ediPortfolio(@PathVariable (value = "personaId") Long personaId,
                               @Valid @RequestBody Portfolio portfolio) {
      return ipersonaRepository.findById(personaId).map(persona -> {
          portfolio.setPersona(persona);
          return iportfolioRepository.save(portfolio);
      }).orElseThrow();
   }

   
   @DeleteMapping("/delete/{id}")
       public void deletePortfolio(@PathVariable Long id){
       iportfolioService.deletePortfolio(id);
      
    }
    
}

       
     

