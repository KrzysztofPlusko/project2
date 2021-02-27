package pl.krzysiek.java.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.project2.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {

        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee";
    }

    public String createEmployee(Employee employee, Model model) {


        return "redirect:/employees/new";
    }
}