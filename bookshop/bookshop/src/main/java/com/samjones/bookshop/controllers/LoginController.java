package com.samjones.bookshop.controllers;

import com.samjones.bookshop.models.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String sendLogin(){
        return "login";
    }

//    @PostMapping
//    public String receiveLogin(@ModelAttribute("login") @RequestBody LoginDTO loginDTO){
//        System.out.println("Login attempt: " + loginDTO);
//        return "viewbook";
//    }
}
