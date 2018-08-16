package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelExample {

	public static void main(String[] args) {
		
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\ExcellData\\TestData.xlsx");
		excel.getData(0, 0, 0);
		System.out.println(excel.getData(0, 0, 0));

	}

}
