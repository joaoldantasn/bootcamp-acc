package seminario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		List<String>list = new ArrayList<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		hashset.add("João");
		hashset.add("Igor");
		hashset.add("Israel");
		hashset.add("Mariana");
		hashset.add("Mariana");
		hashset.add(null);
		hashset.add(null);
		
		list.add("João");
		list.add("Igor");
		list.add("Israel");
		list.add("Mariana");
		list.add("Mariana");
		list.add(null);
		list.add(null);
		
		linkedHashSet.add("João");
		linkedHashSet.add("Igor");
		linkedHashSet.add("Israel");
		linkedHashSet.add("Mariana");
		linkedHashSet.add("Mariana");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		
		System.out.println("* List *");
		System.out.println(list);
		System.out.println("----------");
		System.out.println("* HashSet *");
		System.out.println(hashset);
		System.out.println("----------");
		System.out.println("* LinkedHashSet *");
		System.out.println(linkedHashSet);
	}
	
}
