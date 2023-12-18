package Demo.Seleniumscreen;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class testscript extends baseclass {
	
	@Test
	public void listen()
	{
		
	driver.get("https://demowebshop.tricentis.com/login");
	//driver.findElement(By.id("email")).sendKeys("dhanu");
	Assert.assertEquals(driver.getTitle(),"web shop");
			
	}

}
