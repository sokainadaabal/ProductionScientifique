package com.ProductionScientifique;

import com.ProductionScientifique.model.Professor;
import com.ProductionScientifique.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorResource{
  private final ProfessorService professorservice;
    public ProfessorResource(ProfessorService professorservice)
  {
      this.professorservice=professorservice;
  }
  @GetMapping("/all")
    public ResponseEntity<List<Professor>> getAllProfessor()
    {
        List<Professor> professor= professorservice.findAllProfessor();
        return new ResponseEntity<>(professor,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Professor> getProfessorbById(@PathVariable("id") Long id)
    {
        Professor professor=  professorservice.findProfessor(id);
        return new ResponseEntity<>(professor,HttpStatus.OK);
    }
    @PostMapping ("/add")
     public ResponseEntity<Professor> addProfessor(@RequestBody Professor professor)
     
     {
         Professor newprofessor =professorservice.addProfessor(professor);
         return new ResponseEntity<>(newprofessor,HttpStatus.CREATED);
     }
    @PutMapping ("/update")
     public ResponseEntity<Professor> updateProfessor(@RequestBody Professor professor)
     
     {
         Professor updateprofessor = professorservice.updateProfessor(professor);
         return new ResponseEntity<>(updateprofessor,HttpStatus.OK);
     }

      @DeleteMapping ("/delete/{id}")
     public ResponseEntity<Professor> deleteProfessor(@PathVariable("id") Long id)
     
     {
         professorservice.deleteProfessor(id);
         return new ResponseEntity<>(HttpStatus.OK);
     }
}