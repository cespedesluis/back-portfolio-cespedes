package com.cv.luiscespedes.Service;

import java.util.List;

import com.cv.luiscespedes.Entity.Cursos;
import com.cv.luiscespedes.Interface.ICursosService;
import com.cv.luiscespedes.Repository.ICursosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImpCursosService implements ICursosService {
    @Autowired ICursosRepository icursosRepository;

    @Transactional
    @Override
    public List<Cursos> getCursos() {
        List<Cursos> cursos = icursosRepository.findAll();
        return cursos;   
    }

    @Transactional
    @Override
    public Cursos saveCursos(Cursos cursos) {
        return icursosRepository.save(cursos);
    }

    @Transactional
    @Override
    public void deleteCursos(Long id) {
       icursosRepository.deleteById(id);
    }

    @Transactional
    @Override
    public Cursos findCursos(Long id) {
        Cursos cursos=icursosRepository.findById(id).orElse(null);
        return cursos;

       
    }

    @Transactional
    @Override
    public Cursos editCursos (Cursos cursos){
      return icursosRepository.save(cursos);
        
    }
    
}
