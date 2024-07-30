package seminario;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(1L, "João"));
		Pessoa a = pessoas.get(0);
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("-----------");
	
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}
}
