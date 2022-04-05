package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	private static Connection con;
	private static final String name ="root";
	private static final String pass ="51098";
	private static final String url = "jdbc:mysql://localhost:3306/august";
	private static final String drive ="com.mysql.jdbc.Driver";
	
	
	
	public static Connection create()
	{
		
		
		try {
			
			Class.forName(drive);
			con = DriverManager.getConnection(url,name,pass);	
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
		
	}

}
