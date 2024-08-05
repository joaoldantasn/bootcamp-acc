package acc.br.contatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import acc.br.contatos.model.Contato;
import acc.br.contatos.repository.ContatoRepository;


@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	// GET todos os contatos
	@Transactional(readOnly = true)
	public List<Contato> findAll(){
		return repository.findAll();
	}
	
	
}
