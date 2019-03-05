package co.com.politecnicojic.apit.controllers;

import co.com.politecnicojic.apit.models.Program;
import co.com.politecnicojic.apit.models.ResponseObject;
import co.com.politecnicojic.apit.models.Student;
import co.com.politecnicojic.apit.services.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramController {

    @Autowired
    private ProgramService programService;


    @RequestMapping(value = "/programs", method=RequestMethod.GET)
    public ResponseObject<List<Program>> listPrograms(){
        return programService.getAllPrograms();
    }

    @RequestMapping(value = "/programs/register", method = RequestMethod.POST)
    public ResponseObject<Program> insertProgram (@RequestBody Program program) {
        return programService.insertProgram(program);
    }
}
