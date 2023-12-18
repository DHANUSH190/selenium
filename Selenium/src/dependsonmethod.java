import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test(dependsOnMethods = "register")
	public void login()
{
		Reporter.log("testng class executed",true);
	}
@Test
public void register()
{
	Reporter.log("testng for register",true);
	
}
@Test()
public void home() {
	Reporter.log("home page",true);
	Assert.fail();
	
}


}



