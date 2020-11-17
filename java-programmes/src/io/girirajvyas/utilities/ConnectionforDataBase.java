package io.girirajvyas.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionforDataBase {
	public static Connection connection() {
		Connection con = null;

		try {
			// //LOADING THE DRIVER///////////////
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// //CREATING CONNECTION//////////////
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String passwrd = "root";

			con = DriverManager.getConnection(url, user, passwrd);
			return con;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
