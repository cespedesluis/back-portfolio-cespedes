package com.cv.luiscespedes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.luiscespedes.Entity.Login;
import com.cv.luiscespedes.Interface.ILoginService;
import com.cv.luiscespedes.Repository.ILoginRepository;

@Service
public class ImpLoginService implements ILoginService{
    @Autowired ILoginRepository iloginRepository;

    @Override
    public List<Login> getLogin() {
        List<Login> persona = iloginRepository.findAll();
        return persona;
    }
    
}
