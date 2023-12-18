package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class axisnames {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.id("Email")).sendKeys("dhanushdanu397@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dhanush@8548",Keys.ENTER);
	//	driver.findElement(By.className("MuiButton-label")).click();
	}

}
