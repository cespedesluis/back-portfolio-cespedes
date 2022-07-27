
package com.cv.luiscespedes.Interface;

import com.cv.luiscespedes.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    // traer una lista de personas
    
    public List<Experiencia> getExperiencia();
    
    //guarda un objeto tipo persona
    
    public Experiencia saveExperiencia(Experiencia experiencia);
    
    //elimina un objeto pero lo buscamos por el id
    
    public void deleteExperiencia(Long id);
    
    //busca persona por el id
   
    public Experiencia findExperiencia (Long id);

    public Experiencia editExperiencia(Experiencia experiencia);
    
}
