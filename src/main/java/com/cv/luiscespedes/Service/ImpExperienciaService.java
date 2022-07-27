
package com.cv.luiscespedes.Service;

import com.cv.luiscespedes.Entity.Experiencia;
import com.cv.luiscespedes.Interface.IExperienciaService;
import com.cv.luiscespedes.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class ImpExperienciaService implements IExperienciaService{
        @Autowired IExperienciaRepository iexperienciaRepository;
    
        @Transactional

    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> persona = iexperienciaRepository.findAll();
        return persona;
    }

    @Transactional

    @Override
    public Experiencia saveExperiencia(Experiencia experiencia) {
        return iexperienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia editExperiencia(Experiencia experiencia){
        return iexperienciaRepository.save(experiencia);
    }

    @Transactional

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
        
    }

    @Transactional

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
            return experiencia;
    }
    
}
