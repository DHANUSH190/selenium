import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ginpage {
	public  ginpage(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	public void setEmail(WebElement email) {
		this.email = email;
	}
	
		
	
	
		
	}


