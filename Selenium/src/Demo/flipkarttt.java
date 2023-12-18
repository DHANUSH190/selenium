package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkarttt {
	@Test
	public void flip()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkat.com/");
	}

}
