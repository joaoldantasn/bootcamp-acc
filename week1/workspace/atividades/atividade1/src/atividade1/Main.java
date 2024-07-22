package atividade1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos bilhetes da classe A você deseja? ");
		int a = sc.nextInt();
		System.out.print("Quantos bilhetes da classe B você deseja? ");
		int b = sc.nextInt();
		System.out.print("Quantos bilhetes da classe C você deseja? ");
		int c = sc.nextInt();
		
		int valorFinal = a*50 + b*30 + c*20;
		
		System.out.printf("Valor final da compra foi de: " + valorFinal);
		
		sc.close();
	}

}
