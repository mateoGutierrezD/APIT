package co.com.politecnicojic.apit.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teachers")
public class Teacher {

    @Id
    private String id;
    private String documentType;
    private String documentNumber;
    private String name;
    private String lastName;
    private String program;
    private String email;
    private String password;
    private String token;
    private String phone;
    private boolean isCathedra;
    private boolean isFullTime;
    private String subject;

    public Teacher() {
    }

    public Teacher(String id, String documentType, String documentNumber, String name, String lastName, String program, String email, String password, String token, String phone, boolean isCathedra, boolean isFullTime, String subject) {
        this.id = id;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastName = lastName;
        this.program = program;
        this.email = email;
        this.password = password;
        this.token = token;
        this.phone = phone;
        this.isCathedra = isCathedra;
        this.isFullTime = isFullTime;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isCathedra() {
        return isCathedra;
    }

    public void setCathedra(boolean cathedra) {
        isCathedra = cathedra;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
