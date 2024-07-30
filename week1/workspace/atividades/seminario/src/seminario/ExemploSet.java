package seminario;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		Set<Pessoa> pessoas = new HashSet<>();
		Pessoa joao = new Pessoa(1L, "joao");
		pessoas.add(joao); // Adiciona o elemento especificado ao conjunto
		pessoas.contains(joao); // retorna 'true' se o conjunto conter o elemento especificado
		pessoas.size(); // retorna o numero de elementos no conjunto
		pessoas.remove(joao); // remove o elemento especificado no conjunto
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("-----------");
		boolean adicionou = pessoas.add(new Pessoa(1L, "joao"));
		
		if(adicionou) {
			System.out.println("objeto adicionado!");
		}else {
			System.out.println("não foi possivel adicionar");
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
	
}
