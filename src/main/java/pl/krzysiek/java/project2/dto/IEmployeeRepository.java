package pl.krzysiek.java.project2.dto;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.project2.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
