package e1_jdbc1.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program3 {
  //delete the data based on id
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			 
			Scanner  sc=new Scanner(System.in);
			System.out.println("enter the id to delete your data");
			int id =sc.nextInt();
			//1.load or register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb1", "root", "root");
			//3.create the statement
			PreparedStatement statement = connection.prepareStatement("delete from user where id=?");
			
			statement.setInt(1, id);
			//4.execute the statement
			statement.execute();
			//5.close the connection
			connection.close();
		}
		
		
	

}
