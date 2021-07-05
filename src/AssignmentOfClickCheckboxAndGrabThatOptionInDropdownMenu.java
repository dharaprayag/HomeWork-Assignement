import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOfClickCheckboxAndGrabThatOptionInDropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@name='dropdown-class-example']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(option);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String AlertText = driver.switchTo().alert().getText();
		
		if(AlertText.contains(option))
		{
			System.out.println("Alert Success");
		}
		else
		{
			System.out.println("Alert Fail");
		}
		
		
	}

}
