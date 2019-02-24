package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.exceptions.LoginDataIncorrect;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.repositories.LoginStudentRepository;
import co.com.politecnicojic.apit.repositories.LoginTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginStudentRepository loginStudentRepository;

    @Autowired
    LoginTeacherRepository loginTeacherRepository;

    public ResponseController<Student> loginStudent(String email, String password) throws LoginDataIncorrect {
        Student student = loginStudentRepository.findByEmailAndPassword(email, password);

        if(student == null) {
            throw  new LoginDataIncorrect();
        }

        return new ResponseController<Student>(Constants.LOGIN_SUCCESSFUL, student);
    }

    public ResponseController<Teacher> loginTeacher(String email, String password) throws LoginDataIncorrect {
        Teacher teacher = loginTeacherRepository.findByEmailAndPassword(email, password);

        if(teacher == null) {
            throw  new LoginDataIncorrect();
        }

        return new ResponseController<Teacher>(Constants.LOGIN_SUCCESSFUL, teacher);
    }
}
