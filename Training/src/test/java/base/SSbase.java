package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SSbase {
	public static WebDriver d;
	
	@BeforeSuite
	public void initialize() {
		System.out.println("Initialization method");
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\muskagup\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.google.com/");
		}
		else {
			d=new FirefoxDriver();
			d.get("https://www.google.com/");
		}
		
		
	}
	
	@AfterSuite
	public void aftermethod() {
		System.out.println("inside after method");
		d.quit();
		try {
			Runtime.getRuntime().exec("taskill/f/im chromedriver.exe");
		}
		catch(Exception e) {
		}
	}
}
