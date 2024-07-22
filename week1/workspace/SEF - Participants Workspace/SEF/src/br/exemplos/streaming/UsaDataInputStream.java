package br.exemplos.streaming;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UsaDataInputStream { 
	public static void main(String arg[]) throws IOException { 

		File f=new File("dados.dat"); 
		FileInputStream fos=new FileInputStream(f); 
		DataInputStream dos=new DataInputStream(fos); 

		int n = dos.readInt(); 
		float flo = dos.readFloat(); 
		char c = dos.readChar(); 

		System.out.println ("Foram lidos os valores: "); 
		System.out.println ("(int) = "+n);
		System.out.println ("(float) = "+flo); 
		System.out.println ("(char) = "+c); 

		dos.close(); 
	}
} 

