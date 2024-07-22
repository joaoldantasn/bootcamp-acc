package exercicioFiltro;

public class Disciplina {
	private int numeroDeAlunos;
	private String nome;
	private String turno;
	
	public Disciplina(int numeroDeAlunos, String nome, String turno) {
		super();
		this.numeroDeAlunos = numeroDeAlunos;
		this.nome = nome;
		this.turno = turno;
	}

	public int getNumeroDeAlunos() {
		return numeroDeAlunos;
	}

	public void setNumeroDeAlunos(int numeroDeAlunos) {
		this.numeroDeAlunos = numeroDeAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Disciplina [numeroDeAlunos=" + numeroDeAlunos + ", nome=" + nome + ", turno=" + turno + "]";
	}
	
	
}
