package Maven.MAVENPROJECT;

import java.io.IOException;
import java.util.ArrayList;

public class TestExecution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelPractice data = new ExcelPractice();
		ArrayList d =data.getdata("kumaran");
		
		System.out.println(d.get(0));
		System.out.println(d.get(1));
		System.out.println(d.get(2));


	}

}
