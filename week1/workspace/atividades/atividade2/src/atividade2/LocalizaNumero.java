package atividade2;

import java.util.Scanner;

//Faça um programa para pesquisar o valor 8 no vetor dado:
//inteiro vetor[] = {1, 3, 5, 8, 9, 10}
public class LocalizaNumero {
	// Corrigir este algoritmo.
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		int posicao = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar: ");
		int num = sc.nextInt();
		boolean achou = false;
		
		for (int i=0; i<10; i++) {
			if (vetor[i] == num){
				achou = true;
				posicao = i;
		    }
		}
		if (achou) {
	        System.out.println("Achei");
	        //Levando em consideração que a posição inicial do array é 0
	        System.out.printf("Na Posição %d está localizado o numero %d.", posicao, num);			
		}else {
			System.out.println("Este número não pertence a esse Array.");
		}
		
		sc.close();
	}

}