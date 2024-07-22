package br.exemplos.streaming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class InputStreamReaderExample {
 
    private static final String OUTPUT_FILE = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile.txt";
    public static void main(String[] args) {
 
        char[] chars = new char[100];
 
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(OUTPUT_FILE),"UTF-8")) {
 
            // read 100 characters from the file
            inputStreamReader.read(chars);
 
            System.out.println(Arrays.toString(chars));
 
            Arrays.fill(chars,' ') ;
 
            /// read 50 character from the file
            // and place them after chars[4] position in the array
            inputStreamReader.read(chars,4,50);
 
            System.out.println(Arrays.toString(chars));
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
