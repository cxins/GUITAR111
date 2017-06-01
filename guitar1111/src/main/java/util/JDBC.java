package util;
import java.sql.*;

public class JDBC
{
	static Connection conn = null;  
    static PreparedStatement pst = null; 
	public static Connection getSqliteConnection(){
	    try {
	    	Class.forName("org.sqlite.JDBC");
	    	conn = DriverManager.getConnection("jdbc:sqlite:guitar.db");        
	        return conn;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null; 
    }
	public static Connection getMysqlConnection(){
			try {  
	            Class.forName("com.mysql.jdbc.Driver"); 
	            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/guitar", "root", "1234");
	            return conn;
			} catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		return null;
    }
}	
	 
