package com.cv.luiscespedes.Interface;

import java.util.List;

import com.cv.luiscespedes.Entity.Educacion;

public interface IEducacionService {
    // traer una lista de personas
    
    public List<Educacion> getEducacion();
    
    //guarda un objeto tipo persona
    
    public Educacion saveEducacion(Educacion educacion);
    
    //elimina un objeto pero lo buscamos por el id
    
    public void deleteEducacion(Long id);
    
    //busca persona por el id
   
    public Educacion findEducacion (Long id);

    public Educacion editEducacion(Educacion educacion);

}
