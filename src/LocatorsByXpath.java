import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Open a Home page
		driver.get("https://www.kayak.co.in/");
		System.out.println(driver.getTitle());
		
		//#oNVr-switch-display
		
		//driver.findElement(By.id("oNVr-switch-display-status")).click();
		driver.findElement(By.cssSelector("#oNVr-switch-display")).click();
		driver.findElement(By.id("oNVr-switch-option-1")).click();
		driver.findElement(By.xpath("//*[@id='c_pmp-cabinType-widget-display-status']")).click();
		driver.findElement(By.id("c_pmp-cabinType-widget-option-3")).click();
		driver.findElement(By.xpath("//*[@id='c_pmp-baggage-dialog-trigger']/div/div[1]/div/div")).click();
		driver.findElement(By.cssSelector("#JmlB > span")).click();
		
		
				//*[@id='c_pmp-baggage-dialog-trigger']/div/div[1]/div/div
		//*[@id='c_pmp-cabinType-widget-display-status']
		
		
	}
	
	
}
