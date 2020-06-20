package javasampleprgs;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

				
				File f=new File("SeleniumExcel.xlsx");
				
				FileInputStream fis = new FileInputStream(f);
				
				XSSFWorkbook book = new XSSFWorkbook(fis);
				
				XSSFSheet sheet = book.getSheet("Sheet1");
				
				double a = sheet.getRow(1).getCell(1).getNumericCellValue();
				
				System.out.print(a);
				
				
			}

		

}
