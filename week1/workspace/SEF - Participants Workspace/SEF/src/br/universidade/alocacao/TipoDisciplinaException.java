package br.universidade.alocacao;

public class TipoDisciplinaException extends Exception{
		@Override
		public String getMessage() {
	    		//3 - Enter a message in it and return the same
			    System.out.println("Tipo de Disciplina deve ser Graduação ou Pos-Graduacao");
			    
				return "Tipo de Disciplina deve ser Graduação ou Pos-Graduacao";
		}

		@Override
		public String toString() {
			return "CustomException [getMessage()=" + getMessage() + "]";
		}

}
