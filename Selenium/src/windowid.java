import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowid {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String id = driver.getWindowHandle();
	System.out.println(id);
	Dimension SIZE = driver.manage().window().getSize();
	System.out.println(SIZE);
	
	
}
	
	

}
