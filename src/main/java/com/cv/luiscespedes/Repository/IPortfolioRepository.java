package com.cv.luiscespedes.Repository;

import com.cv.luiscespedes.Entity.Portfolio;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IPortfolioRepository extends JpaRepository<Portfolio,Long> {

    
}
