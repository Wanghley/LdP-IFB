package operacoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLite {
	private static Connection connection;
	private static String pass,userin,passin;
	public SQLite(String user,String password) {
		try {
			Class.forName("org.sqlite.JDBC");//Instructions of how to connect
			connection = DriverManager.getConnection("jdbc:sqlite:info.db");//Connecting to DB
			System.out.println("Connect Successfully to the DB!");			
		} catch (Exception e) {
			System.err.println("Cannot connect to the DB!");
		}
		userin = user;
		passin = password;
	}
	public static boolean UserExists() {
		boolean exist = false;
		try {
			Statement stmt = connection.createStatement();
			String SqlRead = "select * from admins";
			ResultSet rs = stmt.executeQuery(SqlRead);
			System.out.println("ID\tUserName\tPassword");
			while(rs.next()) {
				String UserName = rs.getString("User_name");
				if(UserName.equals(userin)) {
					pass = rs.getString("Password");
					exist=true;
					break;
				}
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("cannot read the DB");
			e.printStackTrace();
		}
		return exist;
	}
	public static boolean ComparaPass() {
		if(passin.equals(pass)) {
			return true;
		}else {
			return false;
		}
	}
}
