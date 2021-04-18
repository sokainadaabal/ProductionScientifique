package com.repo;

import com.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepo  extends JpaRepository<Professor,Long>
{

    void deleteProfessorById(Long id);

    Optional<Professor> findprofessorById(Long id);
}
