import org.testng.Reporter;
import org.testng.annotations.Test;
public class demo
{
@Test(priority=2,invocationCount = 5,threadPoolSize = 3)
	public void login()
{
		Reporter.log("testng class executed",true);
	}
@Test(priority=1,enabled = false)
public void register()
{
	Reporter.log("testng for register",true);
	
}
@Test(invocationCount = 0)
public void home() {
	Reporter.log("home page",true);
}


}
