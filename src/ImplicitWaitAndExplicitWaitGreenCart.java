 import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitAndExplicitWaitGreenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.google", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//APPLY IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		String[] veggyArr= {"Cucumber", "Tomato", "Potato", "Pumpkin", "Onion", "Capsicum"};
		
		//PUBLIC VOID CLASS CALLED HERE 
		selectedVeggies(driver, veggyArr);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("#root > div > header > div > div.cart > div.cart-preview.active > div.action-block > button")).click();
		
		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
				
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/button")).click();
		
		WebElement Country_dropdown = driver.findElement(By.xpath("//*[@value='Bahamas']/parent::select"));
		Select Country_dp = new Select(Country_dropdown);
		Country_dp.selectByVisibleText("India");
	
		///CLICK ON AGREE TO THE TERMS AND CONDITIONS
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		
		// CLICK ON PROCEED BUTTON
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();
		
	}
	
	public static void selectedVeggies(WebDriver driver, String[] veggyArr)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0; i<products.size(); i++)
		{
			String[] veggies = products.get(i).getText().split("-");
			String veggiesBuy = veggies[0].trim();
			
			List veggiesList = Arrays.asList(veggyArr);
				if(veggiesList.contains(veggiesBuy))
				{
					
				/*for(int vegQty = 0; vegQty<2; vegQty++)
				{
					driver.findElement(By.xpath("//*[@class='increment']")).click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}*/
					
				// We will write custom logic 
					// for tomotao : 1 kg
					// for culliflower : 3 kg
					// for beetrote : 4 kg
					
					// Java Dictionary
					/*key string
					value int
					key : tomoto
					value : 2
					key : culli
					value :*/ 
				// aa text change kar chaku
					
					
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					int veggyCount = 0;
					if (veggyCount==veggyArr.length)
					{
						break;
					}
				}			
		}
		
	}
	
}
