package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wr {
	
	
    public static void main(String[] args) {
        String excelFilePath = "data.xlsx";
         
        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            
            Object[][] bookData = {
                    {"The Passionate Programmer", "Chad Fowler", "16"},
                    {"Software Craftmanship", "Pete McBreen", "26"},
                    {"The Art of Agile Development", "James Shore", "32"},
                    {"Continuous Delivery", "Jez Humble", "41"},
                    
                    
                    
            };
 
            int rowCount = sheet.getLastRowNum();
 
            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);
 
                int columnCount = 0;
                 
                Cell cell = row.createCell(columnCount);
             //   cell.setCellValue(rowCount);
                 
                for (Object field : aBook) {
                    cell = row.createCell(columnCount++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    }
                }
 
            }
 
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream("data.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
             
        }   catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

}
