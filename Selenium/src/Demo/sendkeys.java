package Demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class sendkeys {
		

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/login");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).submit();
			Thread.sleep(2000);
			String colour = driver.findElement(By.className("message-error")).getCssValue("color");
			TakesScreenshot ts=(TakesScreenshot) driver;
			java.io.File page = ts.getScreenshotAs(OutputType.FILE);
			File fl=new File("./screenshotsss/img1.png");
			FileHandler.copy(page, fl);
		}

}
