import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class crossBrowser{
	WebDriver driver;
	@Parameter("Browser")
	@Test
	public void demo(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			new EdgeDriver();
		}
		driver.get("https://demowebshop.tricentis.com/login");
	}

}
