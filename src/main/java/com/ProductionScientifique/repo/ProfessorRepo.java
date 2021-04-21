package com.ProductionScientifique.repo;

import com.ProductionScientifique.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ProfessorRepo  extends JpaRepository<Professor,Long>
{

    void deleteProfessorById(Long id);

    Optional<Professor> findProfessorById(Long id);
}
