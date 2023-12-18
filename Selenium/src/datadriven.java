import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class datadriven {
	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("./testdata/selenium.properties");
		Properties pt=new Properties();
		pt.load(fr);
		String url = pt.getProperty("URL");
		System.out.println(url);
}

}
