package Demo;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(new java.net.URL("https://www.facebook.com/"));;
		
		
	}

}
