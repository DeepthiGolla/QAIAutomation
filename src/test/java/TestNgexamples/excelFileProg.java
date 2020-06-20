package TestNgexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFileProg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File f=new File("SeleniumExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		double a = sheet.getRow(1).getCell(0).getNumericCellValue();
		
		System.out.println(a);
		
		double b =sheet.getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(b);
		
		double sum = a+b;
		
		sheet.getRow(1).createCell(2).setCellValue(sum);
		System.out.println(sum);
		
		FileOutputStream out = new FileOutputStream(f);
		
		book.write(out);
		
		book.close();
		
		out.flush();
		
		out.close();
		
		
		//XSSFWorkbook book1 = new XSSFWorkbook();
		
		//selenium IDE  (its available with FF, chrome)
		
		//Selenium RC
		
		//Selenium web driver 
		
		//selenium grid 
		
		
		
		
	}

}
