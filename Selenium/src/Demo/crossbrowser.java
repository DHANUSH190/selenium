package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void main(String Browser)
	{
		//driver=new ChromeDriver();
		if(Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (Browser.equals("firefox")) 
		{
			driver=new EdgeDriver();
			
		}
		driver.get("https://www.facebook.com/");
	}

}
