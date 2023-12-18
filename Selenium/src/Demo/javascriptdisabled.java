package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptdisabled {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		//WebElement corejava = driver.findElement(By.xpath("//a[text()='Core Java']"));
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		driver.findElement(By.linkText("Documentation Download")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-lbl='close']")).click();
		driver.switchTo().window("https://www.oracle.com/java/technologies/javase-jdk21-doc-downloads.html");
	driver.findElement(By.linkText("jdk-21.0.1_doc-all.zip")).click();
		WebElement disable = driver.findElement(By.linkText("Download jdk-21.0.1_doc-all.zip"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",disable);
		
	}

}
