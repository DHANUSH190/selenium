import org.openqa.selenium.chrome.ChromeDriver;

public class POM {
	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/login");
			ginpage gg=new ginpage(driver);
			gg.getEmail().sendKeys("dhanush");
			driver.navigate().refresh();
			gg.getEmail().sendKeys("sharath");
	}

}
