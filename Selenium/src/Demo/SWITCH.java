package Demo;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWITCH {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(new java.net.URL("https://shoppersstack.com/products_page/4"));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.getCurrentUrl();
		driver.navigate();
	
		driver.findElement(By.id("compare")).click();
		String parentid=driver.getWindowHandle();
	Set<String>	id=driver.getWindowHandles();
	id.remove(parentid);
	
	for(String ids:id)
	{
	driver.switchTo().window(ids);
	driver.close();
	}
		
	}

}
