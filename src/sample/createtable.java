package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createtable {
	
	public static void create() throws ClassNotFoundException, IOException, SQLException
	{
		
		try {
			
			 FileInputStream file = new FileInputStream(new File("data.xlsx"));


		     XSSFWorkbook workbook = new XSSFWorkbook(file);

		 
		     XSSFSheet sheet = workbook.getSheetAt(0);

		     
		 	int count = sheet.getLastRowNum();
			XSSFCell first = sheet.getRow(0).getCell(0);
			String one=first.toString();
			
			XSSFCell second = sheet.getRow(0).getCell(1);
			String two=second.toString();		
			
			XSSFCell third = sheet.getRow(0).getCell(2);
			String three=third.toString();

		    table.tab(one,two, three);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("---------------");
		imp.main(null);
		
	}
	

		// TODO Auto-generated method stub

	
	

}
