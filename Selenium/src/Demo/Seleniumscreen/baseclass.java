package Demo.Seleniumscreen;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
	
	public static ChromeDriver driver;
	@BeforeClass
	public static void browse()
	{
	ChromeDriver driver=new ChromeDriver();	
	}

}
