package com.accenture.consumo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.consumo.interfaces.CepService;
import com.accenture.consumo.model.Endereco;
import com.accenture.consumo.service.EnderecoService;

@RestController
@RequestMapping("/ceps")
public class CepRestController {

	@Autowired
	private CepService cepService;
	
	@Autowired
	private EnderecoService enderecoService;

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	}
	
    @PostMapping("/{cep}")
    public ResponseEntity<Endereco> salvarEndereco(@PathVariable String cep) {
        Endereco endereco = enderecoService.salvarEndereco(cep);
        return endereco != null ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build();
    }
	
    @GetMapping
    public ModelAndView listar() {
        List<Endereco> listaEndereco = enderecoService.listarTodosEnderecos();

        ModelAndView modelAndView = new ModelAndView("enderecos");
        modelAndView.addObject("enderecosList", listaEndereco);


        return modelAndView;
    }

	

}
