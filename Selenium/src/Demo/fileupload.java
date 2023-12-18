package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiAjrarBhAWEiwA2qWdCJ7YlPeNthGSuiIla3_gHmdL2teE6-gHL1_ZKvWKCSKhG2GJq9YgiRoCLC4QAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Downloads\\screenshot (42).jpg");
	}

}
