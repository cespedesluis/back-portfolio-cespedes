package com.cv.luiscespedes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.luiscespedes.Entity.Login;

@Repository
public interface ILoginRepository extends JpaRepository <Login, Long> {
    
}
