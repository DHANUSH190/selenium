package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(settings);
		Thread.sleep(2000);
		driver.get("https://www.redbus.in");
		
	}

}

