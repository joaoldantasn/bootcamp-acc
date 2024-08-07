package com.accenture.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.aluno.model.Aluno;
import com.accenture.aluno.service.AlunoService;

@RestController
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    
    @GetMapping("/aluno")
    public List<Aluno> getAllAluno() {
        return alunoService.getAllAluno();
    }

    
    @GetMapping("/aluno/{id}")
    public Aluno getAluno(@PathVariable("id") int id) {
        return alunoService.getAlunoById(id);
    }

    
    @DeleteMapping("/aluno/{id}")
    public void deleteAluno(@PathVariable("id") int id) {
        alunoService.delete(id);
    }

    
    @PostMapping("/aluno")
    public int saveAluno(@RequestBody Aluno aluno) {
        alunoService.saveOrUpdate(aluno);
        return aluno.getId();
    }
}
