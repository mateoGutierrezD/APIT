package co.com.politecnicojic.apit.repositories;

import co.com.politecnicojic.apit.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends MongoRepository<Course, String> {

    List<Course> findByLevel(String level);
}
