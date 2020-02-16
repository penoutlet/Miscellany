package io.samjones.springsecurityfacebooklogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("")
    public String showHome(HttpServletRequest req, Principal currentUser, Model model){
//        model.addAttribute("so")
        model.addAttribute("currentUser", currentUser);
        return "home";
    }
}
