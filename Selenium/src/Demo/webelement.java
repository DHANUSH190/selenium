package Demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		LocalDateTime systime = LocalDateTime.now();
		String time = systime.toString().replace(":","-");
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		File temp = driver.findElement(By.xpath("//input[@value=\"Log in\"]")).getScreenshotAs(OutputType.FILE);
	File per=new File("./screenshotsss/img2"+time+".png");
	FileHandler.copy(temp, per);
	System.out.println(time);
	}

}
