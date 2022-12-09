package Maven.MAVENPROJECT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void getdata() throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\file.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh =wb.getSheetAt(0);
		int row =sh.getLastRowNum();
		System.out.println(row);
		XSSFRow r =sh.getRow(0);
		int col =r.getLastCellNum();
		System.out.println(col);
		Object gdata[][] =new Object[row-1][col];
		//for(int i=0;i<row;i++)
		for(int i=0;i<row-1;i++)
		{
			r=sh.getRow(i+1);
			for(int j=0;j<col;j++)
			{
				//XSSFCell Cell=r.getCell(j);
				//gdata[i][j]=r.getCell(j).getStringCellValue();
				System.out.println(r.getCell(j));
				
			}
			
		}
		
	}

}
