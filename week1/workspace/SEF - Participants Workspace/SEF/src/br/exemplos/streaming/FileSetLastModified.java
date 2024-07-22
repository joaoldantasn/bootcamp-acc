package br.exemplos.streaming;

import java.io.File;
import java.util.Calendar;
	/*
	 * This example source code demonstrates the use of  
	 * setLastModified() method of File class.
	 * 
	 */
public class FileSetLastModified {
		public static void main(String[] args) {
			
			// initialize File object
			File file = new File("C:\\temp\\dados.dat");		
			
			if(file.exists()){
				// initialize calendar object
				Calendar cal = Calendar.getInstance();
				long modDate = cal.getTimeInMillis();
//				long modDate = Long.valueOf(1584028489020);
				boolean result = file.setLastModified(modDate);
				// check if the rename operation is success
				if(result){
					System.out.println("Operation Success");
				}else{
					System.out.println("Operation failed");
				}
				
			}else{
				System.out.println("File does not exist");
			}
	}
}
