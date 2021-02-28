package pl.krzysiek.java.project2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.krzysiek.java.project2.dto.IProjectRepository;

@Controller
public class HomeController {

    @Autowired
    IProjectRepository proRepo;


    @GetMapping("/")
    public String displayHome(Model model) {


        return "home";
    }
}
