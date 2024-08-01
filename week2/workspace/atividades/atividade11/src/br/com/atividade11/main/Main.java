package br.com.atividade11.main;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.atividade11.dao.LivroDAO;
import br.com.atividade11.model.Livro;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		LivroDAO livroDao = new LivroDAO();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== MENU ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Atualizar Livro");
            System.out.println("3. Deletar Livro");
            System.out.println("4. Listar Livros");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("ADICIONE UM LIVRO");
                    System.out.println();
                    System.out.println("Informe o titulo do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Informe o autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.println("Informe o ano de lançamento do livro: ");
                    int anoLancamento = sc.nextInt();
                    Livro livro = new Livro();
            		livro.setTitulo(titulo);
            		livro.setAutor(autor);
            		livro.setAnoPublicacao(anoLancamento);
            		
            		livroDao.save(livro);
                    break;
                case 2:
                	System.out.println("ATUALIZE O LIVRO");
                    System.out.print("Informe o ID do livro que deseja atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Informe um novo título: ");
                    String novoTitulo = sc.nextLine();
                    System.out.print("Informe um novo autor: ");
                    String novoAutor = sc.nextLine();
                    System.out.print("Informe um novo ano de lançamento: ");
                    int novoAnoLancamento = sc.nextInt();
                    sc.nextLine(); 

                    Livro livroAtualizar = new Livro();
                    livroAtualizar.setId(idAtualizar);
                    livroAtualizar.setTitulo(novoTitulo);
                    livroAtualizar.setAutor(novoAutor);
                    livroAtualizar.setAnoPublicacao(novoAnoLancamento);

                    livroDao.update(livroAtualizar);
                    break;
                case 3:
                    System.out.println("DELETAR LIVRO.");
                    System.out.println("Informe o ID do livro: ");
                    int id = sc.nextInt();
                    //Deletar o livro pelo número de ID
            		livroDao.deleteByID(id);
                    break;
                case 4:
                	System.out.println("LISTA DE LIVROS.");
            		//Visualização dos registros do Banco de dados TODOS
            		for(Livro l : livroDao.getLivros()) {
            			System.out.println("ID: " + l.getId()+ " - Livro: " + l.getTitulo());
            		}
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        sc.close();
		

	}

}
