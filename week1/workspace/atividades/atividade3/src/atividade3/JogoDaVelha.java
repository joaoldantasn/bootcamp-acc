package atividade3;

import java.util.Scanner;

public class JogoDaVelha {
    private static final char VAZIO = ' ';
    private static final char X = 'X';
    private static final char O = 'O';
    private char[][] tabuleiro = new char[3][3];
    private char jogadorAtual;

    public JogoDaVelha() {
        jogadorAtual = X;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    public void jogar() {
        boolean jogando = true;
        while (jogando) {
            imprimirTabuleiro();
            movimentoJogador();
            jogando = !temVencedor();
            if (tabuleiroCheio()) {
                System.out.println("O jogo empatou!");
                break;
            }
            alternarJogador();
        }
        imprimirTabuleiro();
        if (!tabuleiroCheio() && temVencedor()) {
            System.out.println("Jogador " + jogadorAtual + " ganhou!");
        }
    }

    private void imprimirTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private void movimentoJogador() {
        Scanner sc = new Scanner(System.in);
        int linha = -1;
        int coluna = -1;
        while (true) {
            System.out.println("Jogador " + jogadorAtual + ", insira sua jogada (linha e coluna): ");
            linha = sc.nextInt();
            coluna = sc.nextInt();
            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == VAZIO) {
                tabuleiro[linha][coluna] = jogadorAtual;
                break;
            } else {
                System.out.println("Esta jogada não é válida.");
            }
        }
        sc.close();
    }

    private boolean temVencedor() {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;
            }
        }

        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                return true;
            }
        }

        // Verificar diagonais
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true;
        }

        return false;
    }

    private boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == VAZIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private void alternarJogador() {
        jogadorAtual = (jogadorAtual == X) ? O : X;
    }

    public static void main(String[] args) {
    	JogoDaVelha jogo = new JogoDaVelha();
        jogo.jogar();
    }
   
}
