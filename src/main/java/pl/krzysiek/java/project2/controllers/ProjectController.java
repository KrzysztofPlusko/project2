package pl.krzysiek.java.project2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.project2.dto.IProjectRepository;
import pl.krzysiek.java.project2.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectRepository proRepo;

    @GetMapping("/new")
    public String diplayProjectForm(Model model) {

        Project aProject = new Project();
        model.addAttribute("project", aProject);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {

        proRepo.save(project);

        //
        return "redirect:/projects/new";
    }
}
