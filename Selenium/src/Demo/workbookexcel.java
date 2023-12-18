package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class workbookexcel {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("./testdata/Book1selenium.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		LocalDateTime datetime = wb.getSheet("Sheet1").getRow(0).getCell(0).getLocalDateTimeCellValue();
	System.out.println(datetime);
	System.out.println(datetime.getDayOfMonth());
	//System.out.println(datetime.getDayOfYear());
	System.out.println(datetime.getDayOfWeek());
	System.out.println(datetime.getYear());
	}

}
