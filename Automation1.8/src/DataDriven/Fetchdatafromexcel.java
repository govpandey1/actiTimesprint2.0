package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdatafromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./TestData/Seleniumdata.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
	
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row=sheet.getRow(2);
		Cell cell=row.getCell(0);
		String Cust_name=cell.getStringCellValue();
		System.out.println(Cust_name);
		System.out.println((int)row.getCell(1).getNumericCellValue());//the output of the getNumericcellvalue is double if we want to get the number into int need to change the type into int
		int Customer1PhonenUmber = (int)sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(Customer1PhonenUmber);
		boolean status=(boolean)sheet.getRow(1).getCell(2).getBooleanCellValue();
		if(status)
		{
			System.out.println("active customer");
		}
		else
			System.out.println("not active");
		

		

	}

}
