package co.com.politecnicojic.apit.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Programs")
public class Program {

    @Id
    private String id;
    private String name;
    private String sniesRecord;
    private String titleGiven;
    private String duration;
    private String location;
    private String modality;
    private String presentation;
    private String professionalProfile;
    private String proficiencies;
    private List<Course> courses;

    public Program() {

    }

    public Program(String id, String name, String sniesRecord, String titleGiven, String duration, String location, String modality, String presentation, String professionalProfile, String proficiencies, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.sniesRecord = sniesRecord;
        this.titleGiven = titleGiven;
        this.duration = duration;
        this.location = location;
        this.modality = modality;
        this.presentation = presentation;
        this.professionalProfile = professionalProfile;
        this.proficiencies = proficiencies;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsniesRecord() {
        return sniesRecord;
    }

    public void setsniesRecord(String sniesRecord) {
        this.sniesRecord = sniesRecord;
    }

    public String getTitleGiven() {
        return titleGiven;
    }

    public void setTitleGiven(String titleGiven) {
        this.titleGiven = titleGiven;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getProfessionalProfile() {
        return professionalProfile;
    }

    public void setProfessionalProfile(String professionalProfile) {
        this.professionalProfile = professionalProfile;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}


