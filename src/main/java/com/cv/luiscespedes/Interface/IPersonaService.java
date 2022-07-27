package com.cv.luiscespedes.Interface;

import com.cv.luiscespedes.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    // traer una lista de personas
    
    public List<Persona> getPersona();
    
    //guarda un objeto tipo persona
    
    public Persona savePersona(Persona persona);
    
    //elimina un objeto pero lo buscamos por el id
    
    public void deletePersona(Long id);
    
    //busca persona por el id
   
    public Persona findPersona (Long id);

   
    public Persona editPersona(Persona persona);
    
}
