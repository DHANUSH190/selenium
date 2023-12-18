import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File temp=new File("./screenshotsss/img.jpg");
		FileHandler.copy(src, temp);

	}

}
