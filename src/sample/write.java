package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.*;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write {
public static void writeinexcel() throws IOException, SQLException, ClassNotFoundException
    {
        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
  
        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("student Details");
  
        Scanner sc = new Scanner(System.in);
        // This data needs to be written (Object[])
        Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();
        System.out.println("Enter header name");
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        String c3 = sc.nextLine();
        String c4 = sc.nextLine();
        table.tab(c1, c2, c3, c4);
      //  dao.insertindb(c1, c2, c3, c4);
        
        data.put(1, new Object[]{c1, c2, c3, c4 });
        System.out.println("Enter no. of records---------");
        int count = sc.nextInt();
        sc.nextLine();
        int i =2;
        while(count>0)
        {
        	String r1  = sc.nextLine();
        	String r2 = sc.nextLine();
        	String r3 = sc.nextLine();
        	String r4 = sc.nextLine();
        	data.put(i, new Object[]{r1, r2, r3, r4 });
        	dao.insertindb(r1, r2, r3, r4);
        	i++;
        	count--;
        }
        // Iterate over data and write to sheet
        Set<Integer> keyset = data.keySet();
        int rownum = 0;
        for (Integer key : keyset) {
            // this creates a new row in the sheet
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                // this line creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String)obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try {
  
            FileOutputStream out = new FileOutputStream(new File("data.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Entries made on Excel Sheet written successfully.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        main.main(null);
    }
}