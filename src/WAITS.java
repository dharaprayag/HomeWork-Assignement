import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.guru99.com/");
				Thread.sleep(5000);
				List <WebElement> elelist = driver.findElements(By.tagName("a"));
				System.out.println("Total links are: " +elelist.size());
				//driver.g
				/*int listsize = elelist.size();
				for (int i = 0; i<listsize; i++)
				{
					
					elelist.get(i).click();
					//String print = driver.getTitle();
					//System.out.println(print);
					
					
					driver.navigate().back();
				}*/
				
				/*Actions a = new Actions(driver);
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				a.moveToElement(driver.findElement(By.id("mousehover")));
				a.click().keyDown("Top");*/
							
				/*
				driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
				WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
				Select dropdown = new Select(selectDropdown);
				// 2 MORE OPTION IS SELECT BY VISIBLE TEXT AND SELECT BY VALUE
				//dropdown.selectByIndex(0);
				//dropdown.selectByVisibleText("");
				Thread.sleep(3);
				dropdown.selectByValue("option1");*/
				
				
				/*driver.get("https://www.google.com/");
				driver.navigate().back();
				driver.navigate().forward();
				boolean elepresent = driver.findElement(By.id("autocomplete")).isDisplayed();
				System.out.println(elepresent);
				boolean eleenabled = driver.findElement(By.id("displayed-text")).isEnabled();
				System.out.println(eleenabled);
				boolean eleselected = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[2]")).isSelected();
				System.out.println(eleselected);*/
				
				/*driver.navigate().refresh();
				driver.getCurrentUrl();
				driver.navigate().to(driver.getCurrentUrl());
				driver.findElement(By.id("..")).sendKeys(Keys.F5);*/
				
				
				
				driver.getCurrentUrl();
				
				
				//driver.navigate().back();
				
				/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("class"));
				driver.findElement(By.cssSelector("")).sendKeys(Keys.ENTER);*/
					
				/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				System.out.println(driver.getCurrentUrl());
				WebDriverWait wait = new WebDriverWait(driver, 5);
			    System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@name='courses']/tbody/tr[3]/td[2]"))).getText());		
				System.out.println(driver.getTitle());
				driver.close();*/
				
				/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.findElement(By.id("autocomplete")).sendKeys("India");
				driver.findElement(By.id("autocomplete")).clear();*/
				
				
				/*driver.get("https://www.cheapoair.com/?curr=INR");
				driver.manage().deleteAllCookies();
				System.out.println(driver.getWindowHandle());*/	
		
		//driver.navigate().refresh(); 
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'name\']")).getAttribute("id"));
		
		// To initialize js object
		//JavascriptExecutor JS = (JavascriptExecutor)driver;
		// To enter username
		//JS.executeScript("document.getElementById('name').value='SoftwareTestingMaterial.com'");
		// To enter password
		//JS.executeScript("document.getElementById('Pass').value='tester'");
	
		/* IMPLICIT WAIT
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.close();*/
				
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		String print = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]/td[2]")).getText();
		System.out.println("Available text is :"+print);*/
	}

}
