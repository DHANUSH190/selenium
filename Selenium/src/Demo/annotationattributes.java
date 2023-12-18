package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class annotationattributes {
	@Test(invocationCount =2,threadPoolSize = 2)
	public void main() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
	}

}
