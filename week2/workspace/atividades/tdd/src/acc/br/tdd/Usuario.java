package acc.br.tdd;

public class Usuario {
	
	private String nomes;
	private int idade;
	
	public Usuario(String nomes, int idade) {
		this.nomes = nomes;
		this.idade = idade;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean ehMaiorDeIdade() {
		return this.idade >= 18;
	}
	
	
}
