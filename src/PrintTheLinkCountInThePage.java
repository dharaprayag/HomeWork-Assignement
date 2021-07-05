import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintTheLinkCountInThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//COUNT 'A' LINK TAG
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//COUNT 'A' LINK IN PARTICULAR SECTION
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//PARTICULAR COLUMN
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//CLICK ON EACH LINK AND CHECK IF PAGES ARE OPENING
		for (int i = 1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// Open by right Instead                                                                          aclick instead
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}	
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> childWindows = windows.iterator();
		
		while(childWindows.hasNext())
		{
			driver.switchTo().window(childWindows.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}
