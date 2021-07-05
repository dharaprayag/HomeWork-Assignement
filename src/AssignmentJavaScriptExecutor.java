import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).click();
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("Uni");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println(driver.findElement(By.cssSelector("input[id='autocomplete']")).getAttribute("value"));
				
	}

}
