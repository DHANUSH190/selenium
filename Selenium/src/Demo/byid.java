package Demo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class byid {
	public static void main(String[] args) throws MalformedURLException {
	ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(new java.net.URL("https://facebook.com"));
		driver.manage().window().maximize();
		WebElement emailid = driver.findElement(By.id("email"));
		WebElement passid = driver.findElement(By.id("pass"));
		System.out.println(emailid.isDisplayed());
		WebElement loginbtn = driver.findElement(By.name("login"));
		System.out.println(loginbtn.isEnabled());
		//TakesScreenshot ts=(TakesScreenshot)driver
		
		
		/*driver.findElement(By.id("email")).sendKeys("dhanushdanu883@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8548827420");
		driver.findElement(By.name("login")).click();*/
	}

}
