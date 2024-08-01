package br.com.atividade11.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	//Nome do usuário do mysql
	private static final String USERNAME = "root";
	
	//Senha do banco
	private static final String PASSWORD = "123456";
	
	//Caminho do Banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/biblioteca";
	
	/*
	 * Conexão com o banco de dados
	 */
	
	public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
		
		//faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//recuperar uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexão é nula
		if(con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
	
}
