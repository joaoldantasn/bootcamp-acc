package com.accenture.aluno.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.aluno.exceptions.ResourceNotFoundException;
import com.accenture.aluno.model.Aluno;
import com.accenture.aluno.repository.AlunoRepository;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    // getting all student records
    public List<Aluno> getAllAluno() {
        List<Aluno> alunos = new ArrayList<>();
        alunoRepository.findAll().forEach(alunos::add);
        return alunos;
    }

    // getting a specific record
    public Aluno getAlunoById(int id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado com id: " + id));
    }

    public void saveOrUpdate(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    // deleting a specific record
    public void delete(int id) {
        if (!alunoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Aluno não encontrado com id: " + id);
        }
        alunoRepository.deleteById(id);
    }
}
