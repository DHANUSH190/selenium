package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("dhanu");
		Thread.sleep(2000);
		WebElement eyeicon = driver.findElement(By.xpath("//div[@tabindex='0']"));
		a.clickAndHold(eyeicon).perform();
	}

}
