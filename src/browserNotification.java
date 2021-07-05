import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserNotification 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver player = new ChromeDriver(options); 
		

	}

}
