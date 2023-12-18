package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
	ChromeDriver driver;
	@Test(groups = "smoke")
	public void amazo()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
}
	@Test(groups = "smoke")
	public void login()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
	}


}
