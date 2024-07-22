package exercicioFiltro;

import java.util.ArrayList;
import java.util.List;

public class FiltroDisciplina implements Filtro {

	private int minNumeroDeAlunos;
	private int maxNumeroDeAlunos;
	private String turno;
	private List<Disciplina> disciplinas = new ArrayList<>();

	public FiltroDisciplina(int minNumeroDeAlunos, int maxNumeroDeAlunos, String turno, List<Disciplina> disciplinas) {
		super();
		this.minNumeroDeAlunos = minNumeroDeAlunos;
		this.maxNumeroDeAlunos = maxNumeroDeAlunos;
		this.turno = turno;
		this.disciplinas = disciplinas;
	}

	public int getMinNumeroDeAlunos() {
		return minNumeroDeAlunos;
	}

	public void setMinNumeroDeAlunos(int minNumeroDeAlunos) {
		this.minNumeroDeAlunos = minNumeroDeAlunos;
	}

	public int getMaxNumeroDeAlunos() {
		return maxNumeroDeAlunos;
	}

	public void setMaxNumeroDeAlunos(int maxNumeroDeAlunos) {
		this.maxNumeroDeAlunos = maxNumeroDeAlunos;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	@Override
	public boolean filtra(Disciplina d) {
		if (filtroPorTurno(d.getTurno()) && filtroPorNumeroDeAlunos(d.getNumeroDeAlunos())) {
			return true;
		}
		return false;
	}

	public boolean filtroPorTurno(String turno) {
		return this.turno.equals(turno) || this.turno.equals("");
	}

	public boolean filtroPorNumeroDeAlunos(int n) {
		return (n >= minNumeroDeAlunos && n <= maxNumeroDeAlunos) || (minNumeroDeAlunos == 0 && maxNumeroDeAlunos == 0);
	}

	public List<Disciplina> getDisciplinasFiltradas() {
		List<Disciplina> discs = new ArrayList<>();

		for (Disciplina e : getDisciplinas()) {
			if (filtra(e)) {
				discs.add(e);
			}
		}
		return discs;
	}
}
