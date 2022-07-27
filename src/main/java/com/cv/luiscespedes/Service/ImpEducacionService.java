package com.cv.luiscespedes.Service;

import java.util.List;

import com.cv.luiscespedes.Entity.Educacion;
import com.cv.luiscespedes.Interface.IEducacionService;
import com.cv.luiscespedes.Repository.IEducacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImpEducacionService implements IEducacionService {
    @Autowired IEducacionRepository ieducacionRepository;
    


    @Transactional
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> persona = ieducacionRepository.findAll();
        return persona; 
    }

    @Transactional
    @Override
    public Educacion saveEducacion(Educacion educacion) {
        return ieducacionRepository.save(educacion);
        

    }
    @Transactional
    @Override
    public Educacion editEducacion(Educacion educacion){
        return ieducacionRepository.save(educacion);
    }

    @Transactional
    @Override
    public void deleteEducacion(Long id) {
        ieducacionRepository.deleteById(id);
        
    }

    @Transactional
    @Override
    public Educacion findEducacion(Long id) {
            Educacion educacion = ieducacionRepository.findById(id).orElse(null);
            return educacion;
    }

    

   
}
