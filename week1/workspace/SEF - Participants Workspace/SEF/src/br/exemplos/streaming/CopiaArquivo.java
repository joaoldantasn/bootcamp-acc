package br.exemplos.streaming;

import java.io.*; 

public class CopiaArquivo { 

public static void main(String arg[]) throws IOException { 

	FileInputStream in = new FileInputStream("CopiaArquivo.java"); 
	FileOutputStream out = new FileOutputStream("Copia de CopiaArquivo.java"); 
	int c; 

	while ((c = in.read()) != -1)
		out.write(c); 
	in.close(); 
	out.close();
 	}
 } 
