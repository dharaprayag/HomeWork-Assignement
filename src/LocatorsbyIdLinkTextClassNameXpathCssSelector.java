import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsbyIdLinkTextClassNameXpathCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Open an home page
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		
		//create a new object for Validate Header and Footer
		Blocks b = new Blocks();
		
		
		//Validate Header and Footer
		b.ValidateHeader();
		b.Validatefooter();
		
		//Click on Signin link 
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[3]/td[3]/input")).sendKeys("Dhara Dedaniya");
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys("dharaprayagraj");
		driver.findElement(By.className("btn_checkavail")).click();
		driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[9]/td[3]/input")).sendKeys("Dpd@1717");
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(12) > td:nth-child(3) > input[type=password]")).sendKeys("Dpd@1717");
		driver.findElement(By.xpath("//*[@id=\'div_altemail\']/table/tbody/tr[1]/td[3]/input")).sendKeys("dharagharshendiya@gmail.com");
		driver.findElement(By.className("nomargin")).click();
		
		//SELECT A SECURITY QUESTION string value from dropdown menu
		WebElement Selectfromthelist_dropdown = driver.findElement(By.cssSelector("#div_hintQS > table > tbody > tr:nth-child(2) > td:nth-child(3) > select"));
		Select Selectfromthelist = new Select(Selectfromthelist_dropdown); 
		Selectfromthelist.selectByValue("What is your favourite food?");
		
		driver.findElement(By.cssSelector("#div_hintQS > table > tbody > tr:nth-child(4) > td:nth-child(3) > input[type=password]")).sendKeys("Panipuri");
		driver.findElement(By.xpath("//*[@id=\'div_hintQS\']/table/tbody/tr[6]/td[3]/input")).sendKeys("aaaaa");
		driver.findElement(By.id("mobno")).sendKeys("8200609304");
		
		//SELECT DAY OF DOB
		WebElement day_dropdown = driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(1)"));
		Select day_dd = new Select(day_dropdown);
		day_dd.selectByIndex(17);
		
		//SELECT MONTH OF DOB
		WebElement month_dropdown = driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(2)"));
		Select month_dd = new Select(month_dropdown);
		month_dd.selectByIndex(7);
		
		//SELECT YEAR OF DOB
		WebElement year_dropdown = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[3]"));
		Select year_dd = new Select(year_dropdown);
		year_dd.selectByValue("1991");
		
		// SELECT COUNTRY
		WebElement India_dropdown = driver.findElement(By.cssSelector("#country"));
		Select India = new Select(India_dropdown);
		India.selectByVisibleText("United States");
		 	
		

	}

}
