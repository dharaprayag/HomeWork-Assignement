import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageUpAndPageDown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,400)", "");
		executor.executeScript("window.scrollBy(0,-400)", "");
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		executor.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	}

}
