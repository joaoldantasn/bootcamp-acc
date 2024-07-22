package Escola;

public class Disciplina {
	int NumeroDeAlunos;
	String Nome;
	String Turno;

	public Disciplina(int numeroDeAlunos, String nome, String turno) {
		super();
		NumeroDeAlunos = numeroDeAlunos;
		Nome = nome;
		Turno = turno;
	}
	
	public int getNumeroDeAlunos() {
		return NumeroDeAlunos;
	}
	public void setNumeroDeAlunos(int numeroDeAlunos) {
		NumeroDeAlunos = numeroDeAlunos;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTurno() {
		return Turno;
	}
	public void setTurno(String turno) {
		Turno = turno;
	}

}
