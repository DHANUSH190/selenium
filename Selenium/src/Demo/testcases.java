package Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testcases extends crossbrowser {
	@Test
	public void script()
	{
		driver.findElement(By.id("Email")).sendKeys("8548827420");
	}

}
