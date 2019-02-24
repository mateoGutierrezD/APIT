package co.com.politecnicojic.apit.repositories;

import co.com.politecnicojic.apit.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginStudentRepository extends MongoRepository<Student, String > {

    public Student findByEmailAndPassword(String email, String password);
}