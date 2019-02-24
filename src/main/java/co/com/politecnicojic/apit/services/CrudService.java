package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.models.ResponseController;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.models.Teacher;
import co.com.politecnicojic.apit.repositories.StudentRepository;
import co.com.politecnicojic.apit.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    public ResponseController<Student> registerStundent(Student student){
        this.studentRepository.insert(student);
        return new ResponseController<Student>(Constants.STUDENT_REGISTERED_SUCCESSFULL);
    }

    public ResponseController<Teacher> registerTeacher(Teacher teacher){
        this.teacherRepository.insert(teacher);
        return new ResponseController<Teacher>(Constants.TEACHER_REGISTERED_SUCCESSFULL);
    }

}
