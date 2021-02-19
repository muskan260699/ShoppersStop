package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ShoppersStop_Base 
{
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	public void before_scenario()
	{
		try
		{
			prop = new Properties();
			prop.load(new FileInputStream("src\\test\\resources\\config.properties"));
		}catch(Exception e) {}

		
		String browser = prop.getProperty("browser");
		if(browser.matches("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_workspace\\mavanproj2\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.matches("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
	}
	
	@AfterSuite
	public void after_scenario()
	{
		System.out.println("...After Suite...");
		driver.quit();		//close browsers if open 
		try 
		{
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe"); 	//kill chromedriver process
		}catch(Exception e) {}
	}

}
