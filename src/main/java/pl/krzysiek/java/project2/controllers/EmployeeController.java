package pl.krzysiek.java.project2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.java.project2.dto.IEmployeeRepository;
import pl.krzysiek.java.project2.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeRepository empRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {

        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee";
    }

    @GetMapping("/save")
    public String createEmployee(Employee employee, Model model) {

        empRepo.save(employee);
        return "redirect:/employees/new";
    }
}
