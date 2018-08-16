package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {


		File src = new File("C:\\ExcellData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis); //for working with .xlsx files
        // HSSFWorkbook for .xls files
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int row_count = sheet1.getLastRowNum();
		System.out.println(row_count);
		for(int i = 0; i<=row_count; i++)
		{
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data0);
		}
		wb.close();
	

}
}