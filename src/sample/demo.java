package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo {  
    public static void update() throws IOException, SQLException, ClassNotFoundException
    {
         Scanner sc=new Scanner(System.in);
            FileInputStream input_document = new FileInputStream(new File("data.xlsx"));
          
            @SuppressWarnings("resource")
			XSSFWorkbook change = new XSSFWorkbook(input_document); 
           
            XSSFSheet my_worksheet = change.getSheetAt(0);
          
            Cell cell = null; 
         System.out.println("Enter Row");
         int row=sc.nextInt();
         System.out.println("Enter Col");
         int col=sc.nextInt();
            cell = my_worksheet.getRow(row).getCell(col);
            
            System.out.println("Enter string:");
            sc.nextLine();
            String str=sc.nextLine();
           
            cell.setCellValue(str);
      
            input_document.close();
           
            FileOutputStream output_file =new FileOutputStream(new File("data.xlsx"));
        
            change.write(output_file);
           
            output_file.close();
            main.main(null);
    }
}
