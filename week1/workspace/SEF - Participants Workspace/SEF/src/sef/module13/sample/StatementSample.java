package sef.module13.sample;
//Needs to be completed
import java.sql.*;

public class StatementSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/mydb";
			String user = "root";
			String pass = "root";
			
			//1 - Load the driver
					
			//2 - Obtain a connection
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			//3 - Create a Statement
			Statement st = cn.createStatement();
//			st.executeQuery("Select * from banco");
			
			st.executeQuery("Select a.idBanco, a.NomeBanco, a.DataHoaManutencao,b.NomeUsuario "
				      + "from banco a, usuario b "
				      + "where a.Usuario_idUsuario = b.idUsuario");			
			//4 - Execute a query
			ResultSet rs = st.getResultSet();			
			
			System.out.println("ID\tNome\tData\tUsuario");
			//5 - Traverse through the ResultSet and print all the records 
			while(rs.next()){
				System.out.println(rs.getString(1) + " - " + 
						           rs.getString(2) + " - " + 
						           rs.getString(3) + " - " + 
						           rs.getString(4));
				
			}
			
			//closing the connection
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
