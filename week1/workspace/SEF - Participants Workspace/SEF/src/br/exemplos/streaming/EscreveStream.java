package br.exemplos.streaming;

import java.io.*; 
public class EscreveStream {

public static void main(String arg[]) throws IOException { 

	File f=new File("c:\\temp\\dados.dat"); 
	FileOutputStream fos=new FileOutputStream(f); 
	DataOutputStream dos=new DataOutputStream(fos); 

	int n=5; 
	float fo=3.14f; 
	char c='A'; 
	dos.writeInt(n); 
	dos.writeFloat(fo);
 
	dos.writeChar(c); // Apenas precisa fechar a stream mais alta. As demais são fechadas automaticamente. 
	dos.close(); 
	} 
} 
