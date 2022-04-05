package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class imp
{
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException
    {
		
		System.out.println("Enter 1 to Read the data-------------");
		System.out.println();
		System.out.println("Enter 2 to Import the table----------");
		System.out.println();
		System.out.println("Enter 3 to Create the table---------- ");
		
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			excel.read();
			break;
		case 2:
			importinsql.sql();
			break;
		case 3:
			createtable.create();
			break;
			default:
				System.out.println("Enter valid number");
		}
		
		
    }
}