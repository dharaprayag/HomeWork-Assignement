import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverRightClickUpperCaseDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		
		//MOUSE HOVER
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();                                                      
		
		//RIGHT CLICK ON ELEMENT
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		//WRITE IN UPPER CASE
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//DOUBLE CLICK
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("hello").doubleClick().build().perform();
		
		
	}

}
