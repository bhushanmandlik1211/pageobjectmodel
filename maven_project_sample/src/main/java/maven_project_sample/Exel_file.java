package maven_project_sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exel_file {
 
	
	
	public static void main(String[] args) throws IOException {
		
		
		String path="E:\\Bhushan\\maven_project_sample\\src\\main\\resources\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		Sheet sheet=book.getSheetAt(0);
		
		Row r=sheet.getRow(0);
		Cell c=r.getCell(0);
		
		System.out.println(r.getCell(0));
		System.out.println(r.getCell(1));
		System.out.println(r.getCell(2));
		System.out.println(r.getCell(3));
		System.out.println(r.getCell(4));
		System.out.println(r.getCell(5));
		
		Row r1=sheet.getRow(1);
		Cell c1=r1.getCell(1);
		
		System.out.println(r1.getCell(0));
		System.out.println(r1.getCell(1));
		System.out.println(r1.getCell(2));
		System.out.println(r1.getCell(3));
		System.out.println(r1.getCell(4));
		System.out.println(r1.getCell(5));
		
		}

}
