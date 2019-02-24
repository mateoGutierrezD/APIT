package co.com.politecnicojic.apit.controllers;

import co.com.politecnicojic.apit.exceptions.GeneralException;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.models.User;
import co.com.politecnicojic.apit.services.LoginStudentService;
import co.com.politecnicojic.apit.services.LoginTeacherService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginStudentService loginStudentService;
    private LoginTeacherService loginTeacherService;

    public LoginController(LoginStudentService loginStudentService, LoginTeacherService loginTeacherService) {
        this.loginStudentService = loginStudentService;
        this.loginTeacherService = loginTeacherService;
    }

    @RequestMapping(value = "/login/student", method= RequestMethod.POST)
    public ResponseController<Student> loginStudent(@RequestBody User user) throws GeneralException {
        return loginStudentService.loginStudent(user.getEmail(), user.getPassword());
    }

    @RequestMapping(value = "/login/teacher", method= RequestMethod.POST)
    public ResponseController<Teacher> loginTeacher(@RequestBody User user) throws GeneralException {
        return loginTeacherService.loginTeacher(user.getEmail(), user.getPassword());
    }
}
