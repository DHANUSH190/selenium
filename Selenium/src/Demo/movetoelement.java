package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
	WebElement menlink = driver.findElement(By.partialLinkText("MEN"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(menlink).perform();
		
	}

}
