package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdeselect {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement options = driver.findElement(By.id("cars"));
		Select sc=new Select(options);
		List<WebElement> opt = sc.getOptions();
		for(WebElement ele:opt)
		{
			System.out.println(ele.getText());
		}
		
		
	}

}
