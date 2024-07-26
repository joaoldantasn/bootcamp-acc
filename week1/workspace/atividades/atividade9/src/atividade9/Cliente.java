package atividade9;

public class Cliente {

	private String nome;
	private String cpf;
	private String sobrenome;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String sobrenome) {
		this.nome = nome;
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		return nome + " " + sobrenome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", sobrenome=" + sobrenome + "]";
	}
	
	
	
	
	
}
