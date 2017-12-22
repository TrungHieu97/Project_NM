package DataAccess;
import java.sql.*;
public class ConnectDB {
	public java.sql.Connection connect() {
		java.sql.Connection cons=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/nmcnpm?useSSL=false", "root", "1111");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cons;
	}
}
