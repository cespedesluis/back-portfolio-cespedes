package com.cv.luiscespedes.Repository;

import com.cv.luiscespedes.Entity.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Long> {
    
}
