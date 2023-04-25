package readdata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcle {

	public static String[][] readData(String fileName) throws IOException {
		
		
		//step1-open the workbook using file name and path
		
		//XSSF-Xml SpreadSheet Format
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step 2-entry into sheet

		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		//step 3-to get numberof rows
		
		int rowNum = sheetAt.getLastRowNum();
		
	//	System.out.println("number of rows present :"+ rowNum);
		
		
		//step 4-column-cell ,to get number cell
		
		int cellNum = sheetAt.getRow(0).getLastCellNum();
	//	System.out.println("number of cell present :"+cellNum);
		
		//row index start with '1'
		//need to print data
		//XSSFCell cell = sheetAt.getRow(1).getCell(3);
		//print data inside my consle 
		//String stringCellValue = cell.getStringCellValue();
		//System.out.println(stringCellValue);
		
//createlead -step1-create String 2D array with rowNum,cellNum		
		
		String[][] data=new String[rowNum][cellNum];
		
		
		//print all set data
		
		for (int i = 1; i <=rowNum; i++) {
			
			XSSFRow row = sheetAt.getRow(i);
			
			for (int j = 0; j <cellNum; j++) {
				String filedata = row.getCell(j).getStringCellValue();
				
				System.out.println(filedata);
		//create lead -step2 		
				data[i-1][j]=filedata;
				
				//row 1
				//data-0
			}
		}
		
		wb.close();
		return data;
	}

}
