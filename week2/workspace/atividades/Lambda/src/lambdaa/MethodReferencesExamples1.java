package lambdaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferencesExamples1 {

	public static void main(String[] args)
	{
		// Criando um ArrayList vazio do tipo definido pelo usu�rio
		// Lista de pessoa
		List<String> personList = new ArrayList<>();

		// Adicionando elementos a lista de objetos
		personList.add("vickY");
		personList.add("pOonam");
		personList.add("sachin");

		// Refer�ncia de m�todo para o tipo String
		Collections.sort(personList,String::compareToIgnoreCase);

		// Imprimindo os elementos (nomes) no console
		personList.forEach(System.out::println);
		
	}
}