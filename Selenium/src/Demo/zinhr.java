package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class zinhr {
	@Test
	public void url()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zinghr.com/");
	}

}
