package co.com.politecnicojic.apit.controllers;

import co.com.politecnicojic.apit.exceptions.GeneralException;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.services.LoginService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login/student", method= RequestMethod.POST)
    public ResponseController<Student> loginStudent(@RequestBody String email, String password) throws GeneralException {
        return loginService.loginStudent(email, password);
    }

    @RequestMapping(value = "/login/teacher", method= RequestMethod.POST)
    public ResponseController<Teacher> loginTeacher(@RequestBody String email, String password) throws GeneralException {
        return loginService.loginTeacher(email, password);
    }
}
