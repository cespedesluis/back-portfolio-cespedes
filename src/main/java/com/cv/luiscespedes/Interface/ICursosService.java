package com.cv.luiscespedes.Interface;

import java.util.List;

import com.cv.luiscespedes.Entity.Cursos;

public interface ICursosService {
    
    
    public List<Cursos> getCursos();
    
    
    public Cursos saveCursos(Cursos cursos);
    
    
    public void deleteCursos(Long id);
    
   
    public Cursos findCursos (Long id);

    public Cursos editCursos(Cursos cursos);

}
