package atividade6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 char continuar;

	        do {
	        	String linha = JOptionPane.showInputDialog("Digite a linha de origem (0 a 7): ");
	        int origemLinha  = Integer.valueOf(linha);
	        String coluna = JOptionPane.showInputDialog("Digite a coluna de origem (0 a 7): ");
	        int origemColuna  = Integer.valueOf(coluna);
	        
	        boolean primeiraMovimentacao = (origemLinha == 6 || origemLinha == 1);
	        int direcaoMovimento = 1; 

	        if (board[origemLinha][origemColuna].equals("p")) {
	            direcaoMovimento = -1; 
	        }

	        
	        if (primeiraMovimentacao) {
	        	String casas = JOptionPane.showInputDialog("É sua primeira movimentação. Deseja mover uma ou duas casas? ");
	        	int qtdCasas  = Integer.valueOf(casas);
	            if (qtdCasas == 1 || qtdCasas == 2) {
	            	boolean podeMover = true;
                   for (int i = 1; i <= qtdCasas; i++) {
                       if (!board[origemLinha + i * direcaoMovimento][origemColuna].equals(" ")) {
                           podeMover = false;
                           break;
                       }
                   }
                   if (podeMover) {
                       board[origemLinha + qtdCasas * direcaoMovimento][origemColuna] = board[origemLinha][origemColuna];
                       board[origemLinha][origemColuna] = " ";
                   } else {
                       System.out.println("Não é possível mover o peão. As casas à frente não estão vazias.");
                   }
	            } else {
	                System.out.println("Opção inválida. Movimento não realizado.");
	            }
	        } else {
	            if (board[origemLinha + direcaoMovimento][origemColuna].equals(" ")) {
	                board[origemLinha + direcaoMovimento][origemColuna] = board[origemLinha][origemColuna];
	                board[origemLinha][origemColuna] = " ";
	            } else {
	                System.out.println("Não é possível mover o peão. A casa à frente não está vazia.");
	            }
	        }

	        Scanner sc = new Scanner(System.in);
	        System.out.println("\nTabuleiro após o movimento:");
	        imprimirBoard(board);
	        System.out.print("\nPróximo jogador deseja jogar(s/n): ");
           continuar = sc.next().charAt(0);

       } while (continuar == 'S' || continuar == 's');

       System.out.println("\nJogo encerrado.");
	    
	}

	public static void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}
}
