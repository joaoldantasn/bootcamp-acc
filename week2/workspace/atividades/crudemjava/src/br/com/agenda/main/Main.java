package br.com.agenda.main;

import java.sql.SQLException;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Gabriel Barbosa");
		contato.setIdade(27);
		
		//contatoDao.save(contato);
		
		//Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Luiz Araujo");
		c1.setIdade(25);
		c1.setId(1);
		//contatoDao.update(c1);
		
		//Deletar o contato pelo número de ID
		contatoDao.deleteByID(1);
		
		//Visualização dos registros do Banco de dados TODOS
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}

	}

}
