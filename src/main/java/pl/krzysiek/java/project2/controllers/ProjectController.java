package pl.krzysiek.java.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.project2.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @GetMapping("/new")
    public String diplayProjectForm(Model model) {

        Project aProject = new Project();
        model.addAttribute("project", aProject);
        return "project-new";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
        //
        return "";
    }
}
