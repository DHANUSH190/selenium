package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement src = driver.findElement(By.xpath("class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		WebElement dst = driver.findElement(By.id("trash"));
		//WebElement f = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe]"));
		driver.switchTo().frame(3);
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(src, dst).perform();
	}

}
