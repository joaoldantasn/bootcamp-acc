package br.universidade.alocacao;

import sef.module8.sample.CustomException;

public class Disciplina {
	private String nome;
	private String[] nomesProfessores;
	private int quantidadeCreditos;
	private String tipoDisciplina;
	private String disciplinaConjunta;
	
	public Disciplina(String nome, String[] nomesProfessores, int quantidadeCreditos, String tipoDisciplina,
			String disciplinaConjunta) {
		super();
		this.nome = nome;
		this.nomesProfessores = nomesProfessores;
		this.quantidadeCreditos = quantidadeCreditos;
		this.tipoDisciplina = tipoDisciplina;
		this.disciplinaConjunta = disciplinaConjunta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getNomesProfessores() {
		return nomesProfessores;
	}
	public void setNomesProfessores(String[] nomesProfessores) throws NomeProfessorException {
		if (nomesProfessores == null) {
			throw new NomeProfessorException();			
		} 
		this.nomesProfessores = nomesProfessores;
	}
	public int getQuantidadeCreditos() {
		return quantidadeCreditos;
	}
	public void setQuantidadeCreditos(int quantidadeCreditos) {
		this.quantidadeCreditos = quantidadeCreditos;
	}
	public String getTipoDisciplina() {
		return tipoDisciplina;
	}
	public void setTipoDisciplina(String tipoDisciplina) {
		this.tipoDisciplina = tipoDisciplina;
	}
	public String getDisciplinaConjunta() {
		return disciplinaConjunta;
	}
	
	public void setDisciplinaConjunta(String disciplinaConjunta) throws TipoDisciplinaException {
		if ((tipoDisciplina != "Graduação") || (tipoDisciplina != "Pos-Graduação")) {
			this.disciplinaConjunta = disciplinaConjunta;			
		} else {
			throw new TipoDisciplinaException();
		}	
	}
}
