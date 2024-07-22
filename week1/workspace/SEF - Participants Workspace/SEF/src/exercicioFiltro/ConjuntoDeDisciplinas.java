package exercicioFiltro;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDeDisciplinas {
	private List<Disciplina> disciplinas = new ArrayList<>();

	
	public ConjuntoDeDisciplinas(List<Disciplina> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public List<Disciplina> getDisciplinasFiltradas(List<FiltroDisciplina> filtros){
		List<Disciplina> discs = new ArrayList<>();
		
		for (Disciplina e : getDisciplinas()) {
			for(FiltroDisciplina f : filtros) {
				if(f.filtra(e)) {
					discs.add(e);
				}
			}
		}
		return discs; 
	}
}
