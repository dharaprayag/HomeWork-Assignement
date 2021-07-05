import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create drive object  for chrome browser
		/*class name= x
				x driver=new x();*/
		
		// invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Open a Home page
		driver.get("https://login.salesforce.com/?locale=eu");
		System.out.println(driver.getTitle());
		
		//Validate header 
		Blocks b = new Blocks();  
		//Classobject.Blockname
		b.ValidateHeader();
		b.Validatefooter();
		
		//Sales force
		driver.findElement(By.id("username")).sendKeys("This is my ID");
		driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		
		
		
		 
		
		
		
		//Rediffmail login
		/*driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("dharapatel80085@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Dpd@1717");
		driver.findElement(By.linkText("Forgot Password?")).click();*/
				
		//Open a home page of yahoo 
		//driver.get("https://in.yahoo.com/?p=us");
		//driver.findElement(By.id("header-signin-link")).click();
		//ERROR//////driver.findElement(By.id("login-username")).sendKeys("dharapatel80085@gmail.com");
		//driver.findElement(By.linkText("Stay signed&nbsp;in")).clear();
		//driver.findElement(By.name("signin")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
