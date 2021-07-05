import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HubAndNodesWithDesiredCapabilities {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver =new RemoteWebDriver(new URL("http://192.168.43.200:4444/wd/hub"),dc);
		 
		driver.get("https://www.google.com/");
		
		driver.get("https://www.makemytrip.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CLICK ON DESKTOP
		driver.findElement(By.className("desktop")).click();
		driver.findElement(By.cssSelector("li[data-cy='roundTrip'] span")).click();
		
		//ORIGIN
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input")).sendKeys("B");
		
		//get suggestion list size
		 int originlength = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")).size();
		 System.out.println(originlength);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 for(int i=0; i<originlength; i++)
		 {
			 String origin = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")).get(i).getText();
			 if(origin.contains("BOM"))
			 {
				 driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")).get(i).click();
				// break;
			 }
		 }
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//DESTINATION
		 //driver.findElement(By.xpath("//input[@id='toCity']/parent::label")).click();
		 driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input")).sendKeys("E");
		 //get size
		 int destinationlength = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")).size();
		 System.out.println(destinationlength);
		 
		 for(int j=0; j<destinationlength; j++)
		 {
			 System.out.println(j);
			 String destination = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li")).get(j).getText();
			 if(destination.contains("EMA"))
			 {
				 driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")).get(j).click();
				 break;
			 }
		 }
		 
		 
		 //DEPARTURE DATE
		 //String depMonth = "January 2021";
		 //String depDay = "17";
		// driver.findElement(By.cssSelector("label[for='departure']")).click();
		 //driver.findElement(By.className("selectedDateField appendBottom8 pointer")).click();
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 while(true)
		 {
			 String month = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
			 if(month.contains("January"))
			 {
				 break;
			 }
			 else
			 {
				 driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
			 }
		 }
		 
		 while(true) 
		 {
			 String year = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]/div/span")).getText();
			 System.out.println(year);
			 if(year.contains("2021"))
			 {
				 break;
			 }
			 else
			 {
				 driver.findElement(By.xpath("//*[@class='DayPicker-NavBar']/span[2]")).click();
			 }
			
		 }
		 
		
		 
		 driver.findElement(By.linkText("27")).click();
		
	}

}
