package com.accenture.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.aluno.model.Aluno;

public interface AlunoRepository  extends JpaRepository<Aluno, Integer>{

}
