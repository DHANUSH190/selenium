import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserthard {
@Test
	public void asserthar()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://zingnext.zinghr.com/portal");
Assert.assertEquals(driver.getTitle(),"TESTYANTRA");
	}
}
