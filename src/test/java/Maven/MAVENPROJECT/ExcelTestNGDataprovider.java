package Maven.MAVENPROJECT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTestNGDataprovider {
	
	@Test(dataProvider="getdata")
	public void test(String a,String b,String c)
	{
		System.out.println(a+b+c);
		
	}
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\file.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh =wb.getSheetAt(0);
		int row =sh.getLastRowNum();
		XSSFRow r =sh.getRow(0);
		int col =r.getLastCellNum();
		Object[][] gdata =new Object[row][col];
		//for(int i=0;i<row;i++)
		for(int i=0;i<row;i++)
		{
			r=sh.getRow(i+1);
			for(int j=0;j<col;j++)
			{
				//XSSFCell Cell=r.getCell(j);
				gdata[i][j]=r.getCell(j).getStringCellValue();
				//System.out.println(r.getCell(j));
				
			}
			
		}
		return gdata;
		
	}

}
