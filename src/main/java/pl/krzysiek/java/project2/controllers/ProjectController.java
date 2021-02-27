package pl.krzysiek.java.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @RequestMapping("/new")
    public String diplayProjectForm() {
        return "project-new";
    }
}
