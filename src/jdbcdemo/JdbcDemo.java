package jdbcdemo;

import java.sql.DriverManager;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			
			System.out.println("Success");

	}

}
