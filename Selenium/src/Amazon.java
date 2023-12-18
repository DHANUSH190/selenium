import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Amazon {
	@Test
	public void amazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.infosys.com/");
		Reporter.log("launched",true);
	}

}


