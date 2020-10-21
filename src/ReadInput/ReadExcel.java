package ReadInput;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		String name;
		String email;
		String phone;
		
		FileInputStream fis = new FileInputStream("./Exceel/studentsData.xls");
				
	//XSSFWorkbook wb = new XSSFWorkbook(fis);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("data");
		
		name =sh.getRow(1).getCell(1).getStringCellValue();
		email = sh.getRow(1).getCell(2).getStringCellValue();
		phone = sh.getRow(1).getCell(3).getStringCellValue();
		System.out.println(name +": "+email+": "+phone);
	
	}//end main

}//end class
