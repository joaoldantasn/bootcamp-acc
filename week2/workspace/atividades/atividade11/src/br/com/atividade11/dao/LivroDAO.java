package br.com.atividade11.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.atividade11.factory.ConnectionFactory;
import br.com.atividade11.model.Livro;

public class LivroDAO {

	//CRUD
	
	//CREATE
	public void save(Livro livro) throws SQLException {
		String sql = "INSERT INTO livros(titulo, autor, ano_publicacao) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o Banco de Dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma preparedStatement para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, livro.getTitulo());
			pstm.setString(2, livro.getAutor());
			pstm.setInt(3, livro.getAnoPublicacao());
			
			//Executar a query
			pstm.execute();
			System.out.println("Livro Salvo com sucesso!");
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			//Fechar as conexões
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//READ(listar)
	public List<Livro> getLivros(){
		String sql = "SELECT * FROM livros";
		
		List<Livro> livros = new ArrayList<Livro>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco. ***SELECT***
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			
			while(rset.next()) {
				Livro livro = new Livro();
				
				//Recuperar o id
				livro.setId(rset.getInt("id"));
				//Recuperar o Titulo
				livro.setTitulo(rset.getString("titulo"));
				//Recuperar o nome
				livro.setAutor(rset.getString("autor"));
				//Recuperar a idade
				livro.setAnoPublicacao(rset.getInt("ano_publicacao"));
				
				livros.add(livro);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Fechar as conexões
			try {
				if(rset != null) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return livros;
	}
	
	//UPDATE
	public void update(Livro livro) {
		String sql = "UPDATE livros SET titulo = ?, autor = ?, ano_publicacao = ? " +
				"WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criar a classe para executar a query
			pstm = conn.prepareStatement(sql);
			
			// Adicionar os valores para atualizar
			pstm.setString(1, livro.getTitulo());
			pstm.setString(2, livro.getAutor());
			pstm.setInt(3, livro.getAnoPublicacao());
			//qual o ID do registro que deseja atualizar?
			pstm.setInt(4, livro.getId());
			
			pstm.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Fechar as conexões
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	//DELETE
	public void deleteByID(int id) {
		String sql = "DELETE FROM livros WHERE id = ?";
		
		Connection conn = null;
		
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criar a classe para executar a query
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			pstm.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
