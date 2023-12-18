package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {
@DataProvider(name="credentials")
	public String[][] datas(){
	String[][] data= {
			{"dhanushdanu397@gmail.com","dhanusg@8548"},{"dhanushdanu883@gmail.com","dhanusg@8548"}
	
			};
	return data;
}
	@Test(dataProvider= "credentials")
	public void getData(String[] cred)
	{
		System.out.println(cred[0]);
		System.out.println(cred[1]);
	}
}
		
	


