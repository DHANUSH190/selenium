package Demo.Seleniumscreen;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	import com.beust.jcommander.Parameter;

	@Test
	public class crossBrowsers{
		
		WebDriver driver;
		@Parameters("Browser")
		@Test
		public void demo(@Optional("chrome") String browsername)
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
		

	
	



