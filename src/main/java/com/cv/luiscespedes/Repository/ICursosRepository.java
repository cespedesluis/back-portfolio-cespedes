package com.cv.luiscespedes.Repository;

import com.cv.luiscespedes.Entity.Cursos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursosRepository extends JpaRepository<Cursos,Long>{
    
}
