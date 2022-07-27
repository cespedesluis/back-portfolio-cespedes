package com.cv.luiscespedes.Service;

import java.util.List;

import com.cv.luiscespedes.Entity.Portfolio;
import com.cv.luiscespedes.Interface.IPortfolioService;
import com.cv.luiscespedes.Repository.IPortfolioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class impPortfolioService implements IPortfolioService{
    @Autowired IPortfolioRepository iportfolioRepository;
    
    @Transactional

    @Override
    public List<Portfolio> getPortfolio() {
        List<Portfolio> portfolio = iportfolioRepository.findAll();
        return portfolio;   
    }

    @Transactional

    @Override
    public Portfolio savePortfolio(Portfolio portfolio) {
        return iportfolioRepository.save(portfolio);
        
    }

  
    
    @Override
    public Portfolio editarPorfolio (Portfolio portfolio){
        return iportfolioRepository.save(portfolio);
        

    }

    @Transactional

    @Override
    public void deletePortfolio(Long id) {
       iportfolioRepository.deleteById(id);
        
    }

    @Transactional

    @Override
    public Portfolio findPortfolio(Long id) {
        Portfolio portfolio=iportfolioRepository.findById(id).orElse(null);
        return portfolio;
    }
    
}
