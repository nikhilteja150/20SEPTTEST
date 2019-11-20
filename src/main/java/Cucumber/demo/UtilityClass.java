package Cucumber.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass {
	static WebDriver driver;
	public static WebDriver openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Nikhil\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Nikhil\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid Browser !!");
		return driver;
	}
}
