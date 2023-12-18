package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptpopup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert pop = driver.switchTo().alert();
	System.out.println(pop.getText());
	pop.sendKeys("dhanush");
	pop.accept();
	String mesage = driver.findElement(By.id("demo")).getText();
	System.out.println(mesage);
}
}
