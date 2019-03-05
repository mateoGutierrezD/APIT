package co.com.politecnicojic.apit.repositories;

import co.com.politecnicojic.apit.models.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends MongoRepository<Program, String> {

}
