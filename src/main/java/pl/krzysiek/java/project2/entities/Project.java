package pl.krzysiek.java.project2.entities;

import javax.persistence.Entity;

@Entity
public class Project {

    private long projectId;
    private String name;
    private String stage; // NONSTARTED, INPROGRESS, COMPLETED;
    private String description;

    public Project() {

    }

    public Project(String name, String stage, String description) {
        this.name = name;
        this.stage = stage;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
