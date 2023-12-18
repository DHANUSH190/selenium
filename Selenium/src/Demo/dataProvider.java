package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
		@DataProvider
		public String[][] datasender()
		{
			String[][] data= {
					{"dhanushdanu397@gmail.com","dhanush@8548"},
					{"dhanushdanu883@gmail.com","dhnaush@8548"}};
			
			return data;
			}
			@Test(dataProvider="datasender")
			public void login(String[] cred)
			{
				ChromeDriver driver=new ChromeDriver();
				driver.get("https//:demotricenyis");
				driver.findElement(By.id("Email")).sendKeys(cred[0]);
				
			}
		
			
		}


