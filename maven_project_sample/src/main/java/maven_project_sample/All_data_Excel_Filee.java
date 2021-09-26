package maven_project_sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_data_Excel_Filee {

	public static void main(String[] args) throws IOException {
		
		String path="E:\\Bhushan\\maven_project_sample\\src\\main\\resources\\data.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		Sheet sheet=book.getSheetAt(0);
		 
		DataFormatter form=new DataFormatter();
		
		int lastRow=sheet.getLastRowNum();
		for(int i=0;i<=lastRow;i++)
		{
			Row r=sheet.getRow(i);
			int lastCell=r.getLastCellNum();
			
			for(int j=0;j<=lastCell;j++)
			{
				Cell cell=r.getCell(j);
				String value=form.formatCellValue(cell);
				System.out.println(value);
			}
			System.out.println();
		}

	}

}
