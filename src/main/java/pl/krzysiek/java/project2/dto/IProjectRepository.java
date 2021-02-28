package pl.krzysiek.java.project2.dto;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.java.project2.entities.Project;

import java.util.List;

public interface IProjectRepository extends CrudRepository<Project, Long> {

    @Override
    public List<Project> findAll();
}
