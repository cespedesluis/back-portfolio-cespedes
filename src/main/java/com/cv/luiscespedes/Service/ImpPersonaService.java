package com.cv.luiscespedes.Service;

import com.cv.luiscespedes.Entity.Persona;
import com.cv.luiscespedes.Interface.IPersonaService;
import com.cv.luiscespedes.Repository.IPersonaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImpPersonaService implements IPersonaService {
        @Autowired IPersonaRepository ipersonaRepository;
    
    
    @Transactional
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
        
        
    }
    @Transactional
    @Override
    public Persona savePersona(Persona persona) {
           return ipersonaRepository.save(persona);
        
        
    }

    @Override
    public Persona editPersona(Persona persona){
        return ipersonaRepository.save(persona);
    }
    
    @Transactional

    @Override
    public void deletePersona(Long id) {
            ipersonaRepository.deleteById(id);
        
    }
    @Transactional

    @Override
    public Persona findPersona(Long id) {
            Persona persona = ipersonaRepository.findById(id).orElse(null);
            return persona;
        
    }

    


    }

    
    
    

