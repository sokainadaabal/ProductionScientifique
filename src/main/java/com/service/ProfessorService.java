package com.service;

import com.exception.UserNotFoudException;
import com.model.Professor;
import com.repo.ProfessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProfessorService {
    private final ProfessorRepo professorRepo;

    @Autowired
    public ProfessorService(ProfessorRepo professorRepo) {
        this.professorRepo = professorRepo;
    }

    public Professor addProfessor(Professor professor)
    {
       professor.setProfessorCode( UUID.randomUUID().toString() );
       return  professorRepo.save(professor);
    }
    public List<Professor> findAllProfessor()
    { return professorRepo.findAll();}
    public Professor updateProfessor(Professor professor)
    {
        return professorRepo.save( professor );
    }
    public Professor findProfessorid(Long id)
    {
        return professorRepo.findprofessorById(id).orElseThrow(()->new UserNotFoudException("User by id"+id+"was not found"));
    }
    public void   delteProfessor(Long id)
    {
        professorRepo.deleteProfessorById( id );
    }
}
