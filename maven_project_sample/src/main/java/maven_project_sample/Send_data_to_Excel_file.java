package maven_project_sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Send_data_to_Excel_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path="D:\\Bhushan\\pageobjectmodel1\\maven_project_sample\\src\\main\\resources\\data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook book= new XSSFWorkbook(file);
		Sheet sheet=book.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.createCell(6);
		cell.setCellValue("school");
		row=sheet.getRow(1);
		cell=row.createCell(6);
		cell.setCellValue("junnar");
		FileOutputStream out=new FileOutputStream(path);
		book.write(out);
		out.close();
		
		
		
		
		
	}

}
