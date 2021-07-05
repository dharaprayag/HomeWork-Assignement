import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTravelSiteKSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		
		//LEAVING FROM
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		//JAVASCRIPT DOM SITE "https://www.w3schools.com/js/js_htmldom_document.asp"
		//JAVASCRIPT DOM CAN EXTRACT HIDDEN ELEMENT
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String originPlacePrint = "return document.getElementById('fromPlaceName').value;";
		String origin = (String) js.executeScript(originPlacePrint);
		System.out.println(origin);
		
		//GOING TO 
		driver.findElement(By.id("toPlaceName")).click();
		driver.findElement(By.id("toPlaceName")).sendKeys("BANG");
		driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
		/*String destinationPlacePrint = "return.document.getElementById('toPlaceName').value;";
		String destination = (String) js.executeScript(destinationPlacePrint);
		System.out.println(destination);*/
	}

}
