package com.accenture.consumo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CepService cepService;

    public Endereco salvarEndereco(String cep) {
        Endereco endereco = cepService.buscaEnderecoPorCep(cep);
        if (endereco != null) {
            return enderecoRepository.save(endereco);
        }
        return null; 
    }

    public List<Endereco> listarTodosEnderecos() {
        return enderecoRepository.findAll();
    }


}