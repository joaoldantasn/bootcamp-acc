/**
 * 
 */
package sef.module3.activity;

import java.util.*;

/**
 * @author 
 *
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);
		
		total = 0;
		
		// complete the code. write for loop for i
		for (int i = 50; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 50 to 100 = " + total);

		// Activity For-each Loop	
		List<Integer> list = new ArrayList<>();
		List<String> listaString = new ArrayList<>();
				
		for (int i = 0; i < 10; i++) {
			list.add(new Integer(i));
			listaString.add(Integer.toString(i));
		}

		for (Integer n : list) { 
		      System.out.print( n.intValue() + " "); //can use print or println
		}
		System.out.println("");
		for (String n : listaString) { 
		      System.out.print( n + " "); //can use print or println
		}

		// Activity Iterator<E> Loop
		Iterator<Integer> it = list.iterator();
		while( it.hasNext() ) {
			Integer i = it.next();
			if ( i % 2 == 0) {
				it.remove();
			}
		}
		
		list.removeAll(list);
		
		System.out.println("");
		for (Integer n : list) { 
		      System.out.print( n.intValue() + " "); //can use print or println
		}

	
	}

}
