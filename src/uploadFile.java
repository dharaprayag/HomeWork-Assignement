import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//*[@id=\'dropzoneInput-label\']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\dhara\\Documents\\check\\fileupload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Convert Now!")));
		driver.findElement(By.xpath("//button[@class*='medium']")).click();
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Here is your file"))).getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click(); 
		

	}

}
