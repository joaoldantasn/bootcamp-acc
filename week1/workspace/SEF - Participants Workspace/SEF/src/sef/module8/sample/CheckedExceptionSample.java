package sef.module8.sample;
// Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]){
		
		String fileName = "SomeFileThatDoesNotExista.txt";
		
		//The following class is used to open a file for reading
	
		try{
		    //The following line must be written in a try catch block
			//else it would not compile since
			//FilenotFoundException is a checked exception. 
			//1 - Instantiate reader and pass fileName as a parameter
			FileReader reader =  new FileReader(fileName);	
			System.out.println("Passou por aqui");

			reader.read();
		} catch (Exception e) {	
			System.out.println("Arquivo nao encontrado");
//			System.out.println(e);
		}
		//2 - catch FileNotFoundException 
		System.out.println("parei aqui");
	}
}
