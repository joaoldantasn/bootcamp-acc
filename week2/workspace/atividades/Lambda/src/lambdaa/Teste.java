package lambdaa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
		
		List<Integer> wordLengths = words.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		System.out.println(wordLengths);
	}
	

	
}
