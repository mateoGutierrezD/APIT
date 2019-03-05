package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.models.ResponseObject;
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

    public ResponseObject<Student> registerStudent(Student student){
        this.studentRepository.insert(student);
        return new ResponseObject<>(true, "200", Constants.STUDENT_REGISTERED_SUCCESSFULL, null);
    }

    public ResponseObject<Teacher> registerTeacher(Teacher teacher){
        this.teacherRepository.insert(teacher);
        return new ResponseObject<>(true, "200", Constants.TEACHER_REGISTERED_SUCCESSFULL, null);
    }

}
