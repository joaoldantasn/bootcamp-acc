package sef.module13.sample;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertSample {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/mydb";
			String user = "root";
			String pass = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
//			PreparedStatement pStmt = cn.prepareStatement("insert into actor values(?,?,?,?)");
			PreparedStatement pStmt = cn.prepareStatement("insert into banco values(?,?,?,?)");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setString(1,"201");
			pStmt.setString(2,"NU-BANK");
			pStmt.setString(3,"2020-03-08 04:34:33.0");
			pStmt.setString(4,"1");
			
			//2 - Execute this query using executeUpdate()
			int rows = pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " row(s) added!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
