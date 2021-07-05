import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[2]")).getText());
		
		System.out.println("done");
	}
	
}