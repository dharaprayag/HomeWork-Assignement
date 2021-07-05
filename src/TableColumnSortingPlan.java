import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColumnSortingPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> firstcol = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]"));
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0; i<firstcol.size(); i++)
		{
			originalList.add(firstcol.get(i).getText());
		}
		
		
	}

}
