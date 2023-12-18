package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class zin {
	@Test
	public void zi()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zinghr.com/");
	}

}
