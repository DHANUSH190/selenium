package Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchro {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.id("Email")).sendKeys("dhanushdanu397@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dhanush@8548");
		
		WebElement loginbtn = driver.findElement(By.className("MuiButton-label"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		loginbtn.click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

}
