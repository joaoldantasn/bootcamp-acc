package sef.module13.sample;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/mydb";
			String user = "root";
			String pass = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			//1 - Create a PreparedStatement with a query "update employee set salary=4900 where id=?" 
//			PreparedStatement pStmt = cn.prepareStatement("update actor set first_name=? where actor_id=?");
			PreparedStatement pStmt = cn.prepareStatement("update banco set NomeBanco=? where idBanco=?");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"NU-BANK");			
			pStmt.setString(2,"201");
			
			//2 - Execute this query using executeUpdate()
			int rows =  pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " row(s)updated!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
