package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil{

	public static void main(String[] args) {
		
		try {
			//Step1
			 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Step2
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","Nikidev@30");
					//Step3
					
					
		}
		
		catch (SQLException e){
			
			e.printStackTrace();
			
			
		}
		
		
		
	}

	public static Connection getDBConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

/*package util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    public static Connection getDBConnection() {
        Connection conn = null;
        try {
            FileReader reader = new FileReader("src/Database.properties");
            Properties props = new Properties();
            props.load(reader);

            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, username, password);
        } catch (IOException | SQLException e) {
            System.out.println("⚠ Failed to connect to the database: " + e.getMessage());
        }

        return conn;
    }
}*/
