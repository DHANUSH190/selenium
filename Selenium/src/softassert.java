import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	@Test
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();
				driver.get("https://zingnext.zinghr.com/portal");
				SoftAssert softassert=new SoftAssert();
				softassert.assertEquals(driver.getTitle(),"Portal Dashboard");
				Reporter.log("successfully navigated",true);
		softassert.assertAll();
			
			
				}
	

}
