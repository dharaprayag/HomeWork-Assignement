import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		String host="localhost";
		String port="3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo", "root", "Dpd@1717");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where Scenario = 'RewardCard'");
		
		while(rs.next())
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("Username"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("Password"));
		}		
		
	}

}
