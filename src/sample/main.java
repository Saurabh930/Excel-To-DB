package sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Write in Excel");
		System.out.println("--------------------------");
		System.out.println("Enter 2 for Read in Excel");
		System.out.println("--------------------------");
		System.out.println("Enter 3 for Update in Excel");
		System.out.println("--------------------------");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1 :
				write.writeinexcel();
				break;
			
			case 2:
				excel.read();
				break;
				
			case 3:
				demo.update();
				break;
				
		    default:
		    	System.out.println("Invalid number");
		}
	}

}
