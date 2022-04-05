package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class table {
	
	static String co;
	public static void tab(String s1,String s2, String s3) throws SQLException
	{
		co=s1;
		
		Connection con =  CP.create();
		
		 Statement stmt = con.createStatement();
		
		String sql = "CREATE TABLE excel" +
                "(id INTEGER auto_increment, " +s1+
                " VARCHAR(50), " + s2+
                " VARCHAR(50), " + s3+
                " VARCHAR(50), " +
                " PRIMARY KEY ( id ))";
		stmt.executeUpdate(sql);
		stmt.close();
		System.out.println("Table created");
		
		
	}

}
