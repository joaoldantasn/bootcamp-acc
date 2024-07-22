package Escola;

import java.util.ArrayList;

public class ConjuntoDeDisciplinas implements IConjuntoDeDisciplinas {
	private static final String[] PopularDisciplinas = null;

	private static final String[] FiltroPorTurno = null;

	String[] Disciplinas;
	
	// Popular o array de disciplinas
	ArrayList<Disciplina> ArrayDisciplinas = new ArrayList<>();
		
	public String[] PopularDisciplinas(String NomeDisciplina) {
		// Retorna array com disciplinas filtradas
//		ArrayDisciplinas.add(NomeDisciplina);
				
		return PopularDisciplinas;
	}
	
	@Override
	public String[] FiltroPorTurno(String turno) {
		ArrayList<Disciplina> ArrayDisciplinas = new ArrayList<>();
		
		// instanciar a lista das disciplinas
		// Implementar filtro iterando o for com if por turno
		
		return FiltroPorTurno;		
	}
	
}
