package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintovisible {
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://demoapp.skillrary.com");
			WebElement corejava = driver.findElement(By.xpath("//a[text()='Core Java']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView(false)",corejava);
		
	}

}
