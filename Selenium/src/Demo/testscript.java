package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testscript {
	ChromeDriver driver;
	@Test
	public void execute()
	{
	 driver=new ChromeDriver();
	driver.get("https://www.zinghr.com/");
	Assert.fail();
	}

}
