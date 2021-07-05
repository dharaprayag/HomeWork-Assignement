import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("th")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size()); 
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());		
	
	}
}
