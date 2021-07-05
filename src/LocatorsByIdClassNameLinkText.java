import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByIdClassNameLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://login.salesforce.com/?locale=in");
		driver.get("https://www.google.com/");
		
		//Open a Home page
				driver.get("https://www.rediff.com/");
				System.out.println(driver.getTitle());
				
				//Validate header 
				Blocks b = new Blocks();  
				//Classobject.Blockname
				b.ValidateHeader();
				b.Validatefooter();
				
				driver.findElement(By.linkText("Sign in")).click();
				driver.findElement(By.name("login")).sendKeys("dharapatel80085@gmail.com");
				driver.findElement(By.name("passwd")).sendKeys("Dpd@1717");
				driver.findElement(By.linkText("Forgot Password?")).click();
				
	}
}
