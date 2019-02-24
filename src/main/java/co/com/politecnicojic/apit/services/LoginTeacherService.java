package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.exceptions.EmailIncorrect;
import co.com.politecnicojic.apit.exceptions.GeneralException;
import co.com.politecnicojic.apit.exceptions.PasswordIncorrect;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginTeacherService {

    @Autowired
    TeacherRepository teacherRepository;


    public ResponseController<Teacher> loginTeacher(String email, String password) throws GeneralException {
        Teacher teacher = teacherRepository.findByEmail(email);

        if (teacher == null) {
            throw new EmailIncorrect();
        }

        if (!(password.equals(teacher.getPassword()))) {
            throw new PasswordIncorrect();
        }

        return new ResponseController<Teacher>(Constants.LOGIN_SUCCESSFUL, teacher);
    }
}
