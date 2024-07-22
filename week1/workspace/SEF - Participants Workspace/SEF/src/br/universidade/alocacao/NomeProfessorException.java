package br.universidade.alocacao;

public class NomeProfessorException extends Exception{
	@Override
	public String getMessage() {
    		//3 - Enter a message in it and return the same
		    System.out.println("Nome do professor não pode ser nulo");
		    
			return "Nome do professor não pode ser nulo";
	}

	@Override
	public String toString() {
		return "CustomException [getMessage()=" + getMessage() + "]";
	}
}
