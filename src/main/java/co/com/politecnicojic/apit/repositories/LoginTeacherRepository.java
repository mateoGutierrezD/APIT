package co.com.politecnicojic.apit.repositories;

import co.com.politecnicojic.apit.models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginTeacherRepository extends MongoRepository<Teacher, String > {

    public Teacher findByEmailAndPassword(String email, String password);
}