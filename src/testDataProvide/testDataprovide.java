package testDataProvide;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testDataprovide {
		
	public String cellValue1;
	public String cellValue2;
	public String cellValue3;
	public String cellValue4;
	public String cellValue5;
	public  void readExceldata(String filePath, String fileName, String sheetName) throws IOException {
		
		FileInputStream input= new FileInputStream(filePath);
		Workbook wb= null;
		String fileextension= fileName.substring(fileName.indexOf("."));
		if(fileextension.equals(".xlsx")) {
			
			wb =new XSSFWorkbook(input);
		}
		
		else if(fileextension.equals(".xls")) 
		{
			wb=new HSSFWorkbook(input);
		}
		
		Sheet s= wb.getSheet(sheetName);
		
		Row rowNumber=s.getRow(1);
		 cellValue1=rowNumber.getCell(0).getStringCellValue();
		 cellValue2=rowNumber.getCell(1).getStringCellValue();
		 cellValue3=rowNumber.getCell(2).getStringCellValue();
		 cellValue4=rowNumber.getCell(3).getStringCellValue();
		 cellValue5=rowNumber.getCell(4).getStringCellValue();
		System.out.println(cellValue1);
		System.out.println(cellValue2);
		System.out.println(cellValue3);
		
	}


}

/*class mainMethod{
	public static void main(String args[]) throws IOException {
		
		testDataprovide t= new testDataprovide();
		t.readExceldata("C:\\Users\\npatil\\Desktop\\TestDataProvider.xlsx", "TestDataProvider.xlsx", "Test");
		//testDataprovide.readExceldata("C:\\Users\\npatil\\Desktop\\TestDataProvider.xlsx", "TestDataProvider.xlsx", "Test");
	}
}*/