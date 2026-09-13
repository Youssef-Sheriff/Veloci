package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {

	private static String url;
	private static String user;
	private static String pass;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("MySQL JDBC Driver not found on classpath", e);
		}
	}

	public static void initalize(String url, String user, String password) {
		DBConnection.url = url;
		DBConnection.user = user;
		DBConnection.pass = password;
	}

	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
	}

}
