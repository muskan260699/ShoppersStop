package base;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeautyBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	public void initialze() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(prop.getProperty("browser").matches("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ShoppersStop\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
		}
		if(prop.getProperty("browser").matches("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\ShoppersStop\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
		try
		{
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}catch(Exception e) {}
	}
}
