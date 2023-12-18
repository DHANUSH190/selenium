package Demo.Seleniumscreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends SampleTest implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
	
		ITestListener.super.onTestFailure(result);
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src=new File("./screenshotsss/listener.png");
		try {
			FileHandler.copy(temp,src);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
}

	
		


