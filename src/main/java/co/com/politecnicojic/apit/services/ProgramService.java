package co.com.politecnicojic.apit.services;

import co.com.politecnicojic.apit.Base.Constants;
import co.com.politecnicojic.apit.models.Program;
import co.com.politecnicojic.apit.models.ResponseObject;
import co.com.politecnicojic.apit.repositories.CoursesRepository;
import co.com.politecnicojic.apit.repositories.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    @Autowired
    ProgramRepository programRepository;

    @Autowired
    CoursesRepository coursesRepository;

    public ResponseObject<List<Program>> getAllPrograms() {
        List<Program> programList = programRepository.findAll();
        return new ResponseObject<>(true, "200", Constants.SUCCESS, programList );
    }

    public ResponseObject<Program> insertProgram(Program program) {
        this.programRepository.insert(program);
        return new ResponseObject<>(true, "200", Constants.PROGRAM_REGISTERED_SUCCESSFULL, null );
    }

}
