    package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ResourceManager {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/farmacia?useSSL=false";
	private static String JDBC_USUARIO = "root";
	private static String JDBC_SENHA = "root";
	private static Driver driver = null;
	
	public static synchronized Connection getConnection() throws SQLException{
		if(driver == null){
			try{
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver) jdbcDriverClass.newInstance();
				DriverManager.registerDriver(driver);
			} catch (Exception e){
				System.out.println("Falha ao inicializar o JDBC");
				e.printStackTrace();
			}
		}
		return DriverManager.getConnection(JDBC_URL, JDBC_USUARIO, JDBC_SENHA);
	}
	
	public static void close(Connection con){
		try{
			if(con != null)
				con.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
