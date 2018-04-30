package TestNG_Learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.testng.annotations.Test;

public class ApachiPOI
{
	
	 
	@Test
	
	public void ApachePOI() throws Exception {
		File source = new File("C:\\QC\\Learning.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 =wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data0);
		
		
		
	}

}
