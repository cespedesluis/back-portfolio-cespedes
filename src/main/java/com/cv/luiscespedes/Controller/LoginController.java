package com.cv.luiscespedes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cv.luiscespedes.Entity.Login;
import com.cv.luiscespedes.Interface.ILoginService;

@CrossOrigin(origins = "https://portfolioluiscespedes.web.app",maxAge = 3600)
@RestController
@RequestMapping(path = "/api/usuario")

public class LoginController {
    @Autowired ILoginService iloginService;

    @GetMapping ("/traer")
    public List<Login> getLogin(){
        return iloginService.getLogin();
        
    }
    
}
