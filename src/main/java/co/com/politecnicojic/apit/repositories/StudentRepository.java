package co.com.politecnicojic.apit.repositories;

import co.com.politecnicojic.apit.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String > {

    Student findByEmail(String email);
}