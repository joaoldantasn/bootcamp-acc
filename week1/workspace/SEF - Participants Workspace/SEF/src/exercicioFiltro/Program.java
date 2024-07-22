package exercicioFiltro;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Disciplina> discs = new ArrayList<>();
		
		discs.add(new Disciplina(5, "ingles", "m"));
		discs.add(new Disciplina(10, "portugues", "n"));
		discs.add(new Disciplina(15, "matematica", "t"));
		discs.add(new Disciplina(20, "historia", "t"));
		discs.add(new Disciplina(25, "geografia", "m"));
		
		FiltroDisciplina filtro = new FiltroDisciplina(10, 25, "m", discs);
		
		for (Disciplina e : filtro.getDisciplinasFiltradas()) {
			System.out.println(e);
		}

	}
}
