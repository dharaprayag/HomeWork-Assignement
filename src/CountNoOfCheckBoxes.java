import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//first checkbox click and then its unclick
		
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isEnabled());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isEnabled());
		
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//*[@type='checkbox']")).getSize());
		
		
		
	}
	
	

}
