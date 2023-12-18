package Demo.Seleniumscreen;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Apple {
	@Test
	public void apple()
	{
	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("launched",true);
	}
}
