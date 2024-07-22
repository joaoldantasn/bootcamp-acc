package sef.module13.sample;
//Needs to be completed
import java.sql.*;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSample {

	//	This source code tries to establish a connection to a MySQL server
	//	and displays a message concerning the error if connection fails
	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost/mydb";
			String user = "root";
			String pass = "root";
			
			//1 - Load the driver
						
			//2 - Obtain a connection using DriverManager class
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");
			
			//Closing the connection
			cn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
