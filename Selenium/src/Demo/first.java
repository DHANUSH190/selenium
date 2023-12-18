package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("faceboook"))
		{
			System.out.println("title fetched");
		}
		else
		{
			System.out.println("title not fetched");
		}
		WebElement a=driver.findElement(By.id("email"));
		
		
	}

}
