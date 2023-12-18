package Demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.id("Email")).sendKeys("dhanushdanu397@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Dhanush@8548");
	driver.findElement(By.className("MuiButton-label")).click();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	Thread.sleep(3000);
	WebElement click = driver.findElement(By.xpath("//h1[contains(text(),'TOP CATEGORIES')]"));

	Thread.sleep(2000);
	 WebElement dd=driver.findElement(By.linkText("KIDS"));
	//driver.findElement(By.partialLinkText("ELECTRONIC")).click();
Actions a=new Actions(driver);
a.moveToElement(dd).perform();
a.doubleClick(click);
//driver.manage().window().minimize();
//driver.close();
//List<WebElement> links=driver.findElements(By.tagName("//a"));
//System.out.println(links.size());
driver.findElement(By.xpath("//span[contains(text(),'APPLE 2021 Macbook')]/../..//*button[@id='addtoCart']")).click();

	
}
}
