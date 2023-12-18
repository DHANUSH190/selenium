package Demo.Seleniumscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
  public static  WebDriver driver;

    @BeforeClass
    public void testExample() {
    	new ChromeDriver();
     
    }
}

