package pl.krzysiek.java.project2.dto;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.project2.entities.Employee;
import pl.krzysiek.java.project2.entities.Project;

import java.util.List;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();
}
