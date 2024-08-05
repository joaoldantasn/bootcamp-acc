package acc.br.contatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import acc.br.contatos.model.Contato;
import acc.br.contatos.service.ContatoService;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	@Autowired
	private ContatoService service;
	
	@GetMapping
	public ModelAndView listar() {
		List<Contato> lista = service.findAll();
		
		ModelAndView modelAndView = new ModelAndView("contatos");		
		modelAndView.addObject("contatos", lista);
		
		return modelAndView;
	}

	
	
	
}
