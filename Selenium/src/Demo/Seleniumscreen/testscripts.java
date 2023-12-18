package Demo.Seleniumscreen;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
@Test
public class testscripts extends SampleTest {

	public void listen()
	{
	driver.get("https://chat.openai.com/c/417dd6b9-14d8-46e9-9d18-efa9d8f92fd0");
	//driver.findElement(By.id("email")).sendKeys("dhanu");
	Assert.assertEquals(true,false);
	
	
			
	}

}


