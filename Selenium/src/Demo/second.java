package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com");
		String title=driver.getTitle();
		System.out.println(title);
	
	}

}
