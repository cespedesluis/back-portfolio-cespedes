package com.cv.luiscespedes.Interface;

import java.util.List;

import com.cv.luiscespedes.Entity.Portfolio;

public interface IPortfolioService {

    public List<Portfolio> getPortfolio();
    
    
    public Portfolio savePortfolio(Portfolio portfolio);
    
    
    public void deletePortfolio(Long id);
    
   
    public Portfolio findPortfolio (Long id);

    public  Portfolio editarPorfolio(Portfolio portfolio);
}
