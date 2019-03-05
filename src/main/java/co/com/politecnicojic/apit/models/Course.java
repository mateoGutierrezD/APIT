package co.com.politecnicojic.apit.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Courses")
public class Course {

    @Id
    private String id;
    private String level;
    private String code;
    private String name;
    private String credits;

    public Course() {

    }

    public Course(String id, String level, String code, String name, String credits) {
        this.id = id;
        this.level = level;
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
}
