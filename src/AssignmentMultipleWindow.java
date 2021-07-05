import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> click = windows.iterator();
		//String parentWindow = click.next();
		String childWindow = click.next();

		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.linkText("Click Here")).click();		
		System.out.println(driver.getTitle());
		

		System.out.println("Switch to Child Window");
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		
		
	}

	
}
