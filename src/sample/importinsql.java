package sample;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class importinsql {
	
	public static void sql()
	{
	
    try
    {
        FileInputStream file = new FileInputStream(new File("data.xlsx"));

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Iterate through each rows one by one
        
    	int count = sheet.getLastRowNum();
		
/*
		XSSFCell first = sheet.getRow(0).getCell(0);
		String one=first.toString();
		
		XSSFCell second = sheet.getRow(0).getCell(1);
		String two=second.toString();		
		
		XSSFCell third = sheet.getRow(0).getCell(2);
		String three=third.toString();

        table.tab(one,two, three);
        
        */
        
        boolean flag = false;
        
        for(int i=1 ;i<=count;i++)
        {
        	XSSFCell c1 = sheet.getRow(i).getCell(0);
        		String s1=c1.toString();
        		
        		XSSFCell c2 = sheet.getRow(i).getCell(1);
        		String s2=c2.toString();
        		
        		
        		XSSFCell c3 = sheet.getRow(i).getCell(2);
        		String s3=c3.toString();
        		
        		dao.insertindb(s1, s2 , s3);
        		flag = true;
        	
        }
       
        if(flag)
        {
        	System.out.println("Data imported to SQL");
        }
        
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }
	}
}
