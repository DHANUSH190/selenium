package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
	@Test
	public void face()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
