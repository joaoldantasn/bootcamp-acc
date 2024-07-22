package br.exemplos.streaming;

import java.io.File; 
import java.util.Date; 
import java.text.*; 

class TestaArquivo { 

	public static void main (String args []) { 

		File f = new File ("Circle.java"); 

		System.out.println ("Nome do arquivo: "+f.getName ()); 
		System.out.println ("Caminho: "+f.getPath ()); 
		System.out.println ("Caminho Absoluto: "+f.getAbsolutePath ()); 
		System.out.println ("Diret�rio pai: "+f.getParent ()); 
		System.out.println (f.exists() ? "existe":"n�o existe");
		System.out.println (f.canWrite() ? "pode ser gravado":"n�o pode ser gravado"); 
		System.out.println (f.canRead() ? "pode ser lido":"n�o pode ser lido"); 
		System.out.println (f.isDirectory () ? "� diret�rio":"n�o � diret�rio"); 
//        f.setLastModified("01/01/2020");
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy"); 
		Date data = new Date (f.lastModified ()); 
		System.out.println ("Ultima modifica��o do arquivo: "+df.format (data)); 
		System.out.println ("Tamanho do arquivo: "+f.length ()+ " bytes."); 
	}
} // da class TestaArquivo