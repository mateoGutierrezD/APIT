package co.com.politecnicojic.apit.controllers;

import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.services.CrudService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    private CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @RequestMapping(value = "/register/student", method= RequestMethod.POST)
    public ResponseController<Student> insertStudent(@RequestBody Student student) {
        return crudService.registerStundent(student);
    }

    @RequestMapping(value = "/register/teacher", method=RequestMethod.POST)
    public ResponseController<Teacher> insertTeacher(@RequestBody Teacher teacher) {
        return crudService.registerTeacher(teacher);
    }
}