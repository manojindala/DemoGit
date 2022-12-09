package Maven.MAVENPROJECT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	
	public ArrayList<String> getdata(String testname) throws IOException
	{
		FileInputStream fs = new FileInputStream("E:\\file.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		ArrayList<String> list = new ArrayList<String>();
		
		int r =wb.getNumberOfSheets();
		
		for(int i=0;i<r;i++)
		{
			if(wb.getSheetName(i).equalsIgnoreCase("studentdetails"))
			{
				XSSFSheet ws =wb.getSheetAt(i);
				
				Iterator<Row> it =ws.rowIterator();
				
				//while(it.hasNext())
				//{
				
				Row s = it.next();
				
				Iterator<Cell> itcell=s.cellIterator();
								
				int k=0;
				int coloumn=0;
				
				while(itcell.hasNext())
				{
				
					Cell c =itcell.next();
					//System.out.println(c.getStringCellValue());
					if(c.getStringCellValue().equalsIgnoreCase(testname))
					{
						//System.out.println("run"+c.getRowIndex());
						coloumn=k;
					
					}
					
					k++;
				
				}
				System.out.println(coloumn);
				
				
				while(it.hasNext())
				{
					Row l =it.next();
					if(l.getCell(coloumn).getStringCellValue().equalsIgnoreCase("kumaran"))
					{
						Iterator<Cell> o =l.cellIterator();
						while(o.hasNext())
						{
							Cell c =o.next();
							if(c.getCellType()==CellType.STRING)
							{
								
							list.add(c.getStringCellValue());
							}
							else
							{
								list.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
							
					}
				}
				//}
				
				
			}
		}
		return list;
		
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		
		
		/*XSSFSheet ws =wb.getSheet("studentdetails");
		
		XSSFRow row =ws.getRow(0);
		
		XSSFCell cell =row.getCell(0);
		 
		String a =cell.getStringCellValue();
		
		System.out.println(a);*/

	}

}
