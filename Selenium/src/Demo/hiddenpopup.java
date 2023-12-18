package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com/");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-frame\"]"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
	}

}
