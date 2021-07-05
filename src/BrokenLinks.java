import java.net.HttpURLConnection;
import java.util.List;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String)js.executeScript("return document.title");
		System.out.println("Title of the page :" + title);
		
		
		/*Thread.sleep(3000);
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+ list.size());
		for (int i=0; i<list.size();i++)
		{
			list.get(i).click();
			driver.navigate().back();		
		}*/
	}
	/*public static void verifyLink(String urllink)
	{
		URL link = new URL(urllink);
		HttpURLConnection httpconn = (HttpURLConnection)link.
		
	}*/

}
