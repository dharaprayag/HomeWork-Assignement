import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTipAssignmentWithDropDownDateRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//OPEN HOMEPAGE
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("EWR");
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("input[id='ToTag']")).sendKeys("BOM");
		driver.findElement(By.cssSelector("input[id='ToTag']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[id='ToTag']")).sendKeys(Keys.ENTER);
		
		//SELECT A DEPARTURE DATE
		String depMonth = "September 2020";
		String depDay = "19";
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true)
		{
			String text = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();
			
			if(text.equals(depMonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
				
			}			
		}
		
		driver.findElement(By.linkText("19")).click();
		
		//SELECT RETURN DATE
		String arrMonth = "December 2020";
		String arrDay = "22";
		
		driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 1;
		while(i<12)
		{
			i++;
			String text = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div")).getText();
			
			if(text.equals(arrMonth))
			{
				// click()
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			}
		}
		
		driver.findElement(By.linkText("22")).click();
		
		
		
		
		
		
		
		
		
		
		
		//SELECT AN ADULT
		WebElement adult_dropdown = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select adult_dp = new Select(adult_dropdown);
		adult_dp.selectByVisibleText("3");
		//SELECT CHILD
		WebElement child_dropdown = driver.findElement(By.id("Childrens"));
		Select child_dp = new Select(child_dropdown);
		child_dp.selectByIndex(2);
		//SELECT INFANTS
		WebElement infants_dropdown = driver.findElement(By.id("Infants"));
		Select infants_dp = new Select(infants_dropdown);
		infants_dp.selectByVisibleText("1");
		
		//CLICK ON SEARCH BUTTON
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
	}

}
