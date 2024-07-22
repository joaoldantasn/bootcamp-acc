package br.exemplos.streaming;

import java.io.*;  
public class  ReadByte {  
  
   public static void main(String args[])throws IOException {  
  
      // writing string to a file encoded as modified UTF-8  
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\users\\file.txt"));  
      dataOut.writeUTF("Hello !");  
  
      // Reading data from the same file  
      DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\users\\file.txt"));  
  
      while(dataIn.available()>0) {  
        String k = dataIn.readUTF();  
         System.out.print(k+" ");  
      }
   }  
} 
