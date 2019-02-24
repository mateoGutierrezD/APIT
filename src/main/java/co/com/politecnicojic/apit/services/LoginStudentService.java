package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.exceptions.EmailIncorrect;
import co.com.politecnicojic.apit.exceptions.GeneralException;
import co.com.politecnicojic.apit.exceptions.PasswordIncorrect;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.repositories.StudentRepository;
import co.com.politecnicojic.apit.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginStudentService {

    @Autowired
    StudentRepository studentRepository;


    public ResponseController<Student> loginStudent(String email, String password) throws GeneralException {
        Student student = studentRepository.findByEmail(email);

        if (student == null) {
            throw new EmailIncorrect();
        }

        if (!(password.equals(student.getPassword()))) {
            throw new PasswordIncorrect();
        }

        return new ResponseController<Student>(Constants.LOGIN_SUCCESSFUL, student);
    }
}
