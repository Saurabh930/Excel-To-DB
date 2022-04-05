package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dao extends table {
	
	
	public static void insertindb (String str1, String str2, String str3) throws ClassNotFoundException
	{
		
		
		try  {
			
			
			String sql = "INSERT INTO excel values (null,?,?,?)";
			
			Connection con= CP.create();
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			
			pstmt.setString(1,str1);
			pstmt.setString(2,str2);
			pstmt.setString(3,str3);
			
			pstmt.executeUpdate();
			
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
