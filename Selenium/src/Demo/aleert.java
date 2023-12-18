package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class aleert {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://demo.guru99.com/test/delete_customer.php//");
	
	
	driver.findElement(By.name("submit")).click();
	Alert alertpop = driver.switchTo().alert();
	
	Thread.sleep(2000);
	System.out.println(alertpop.getText());
	alertpop.accept();
	System.out.println(alertpop.getText());
	alertpop.accept();
}
}
