package Maven.MAVENPROJECT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fi = new FileInputStream("E:\\file.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		int a = wb.getNumberOfSheets();
		
		XSSFSheet ws = wb.getSheet("studentdetails");
		
		int rows = ws.getLastRowNum();
		int cols = ws.getRow(0).getLastCellNum();
		
		System.out.println("no of rows:" +(rows+1));
        System.out.println("no of column:"+cols);
        
        for(int r=0;r<rows;r++)
        {
        	XSSFRow myrow = ws.getRow(r);
        	for(int c=0; c<=myrow.getLastCellNum()-1;c++)
        	{
        		XSSFCell mycell = ws.getRow(r).getCell(c);
        		String celldata = mycell.toString();
        		System.out.println(celldata);
        		
        	}
        }
        
	}

}
