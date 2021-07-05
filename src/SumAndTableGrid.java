import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SumAndTableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		int sum = 0;
		
		driver.findElement(By.xpath("//*[@id='match_menu_container']/div/div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//nav[@class='cb-nav-bar']/a[2]")).click();
		
		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver,7);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")));
		driver.findElement(By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[1]")).click();	
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
			
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0; i<count-2; i++)

		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger = Integer.parseInt(value); 
			sum = sum + valueinteger; 
		}
		//System.out.println(sum);
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasvalue = Integer.parseInt(Extras);
		int TotalSumValue = sum + extrasvalue;
		
		System.out.println(TotalSumValue);
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue = Integer.parseInt(ActualTotal);
		if(ActualTotalValue==TotalSumValue)
		{
			System.out.println("Count Matches");
		}
		else
		{
			System.out.println("Count Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
