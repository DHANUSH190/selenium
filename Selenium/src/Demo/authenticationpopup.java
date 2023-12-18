package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationpopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://shoppersstack.com/products_page/3");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String id:allwindow)
		{
			driver.switchTo().window(id);
			String url=driver.getCurrentUrl();
			if(url.contains("amazon"))
			{
				break;
			}
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();
		
	}

}
