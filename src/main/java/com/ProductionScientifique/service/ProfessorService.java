package com.ProductionScientifique.service;


import com.ProductionScientifique.exception.UserNotFoundException;
import com.ProductionScientifique.model.Professor;
import com.ProductionScientifique.repo.ProfessorRepo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import javax.transaction.*;
import java.util.List;
import java.util.UUID;

@Service
@Transactional

public class  ProfessorService {
    private  final ProfessorRepo professorRepo;

    @Autowired
    public  ProfessorService(ProfessorRepo professorRepo) {
                this.professorRepo = professorRepo;
    }

    public Professor   addProfessor(Professor professor)
    {
        professor.setProfessorCode(UUID.randomUUID().toString());
        return this.professorRepo.save(professor);
    }
    public  List<Professor> findAllProfessor()
    {
        return this.professorRepo.findAll();
    }
    public  Professor updateProfessor(Professor professor)
    {
        return this.professorRepo.save( professor );
    }
    public  Professor findProfessor(Long id)
    {
       return this.professorRepo.findProfessorById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }
    public   void   deleteProfessor(Long id)
    {
        this.professorRepo.deleteProfessorById(id);
    }
}
