package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {
	public static void main(String[] args) {
	
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.dream11.com/fantasy-football");
			driver.switchTo().frame(0);
			driver.findElement(By.id("regEmail")).sendKeys("8548827420");
			driver.findElement(By.id("regUser")).click();
			driver.switchTo().parentFrame();
			Actions a=new Actions(driver);
			//a.contextClick().perform();
			WebElement aaa = driver.findElement(By.partialLinkText("Download Dream11 to Play Fantasy Football"));
			a.doubleClick(aaa);
			//driver.close();
	}

}
