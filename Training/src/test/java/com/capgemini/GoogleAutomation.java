package com.capgemini;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	WebDriver driver;
	public GoogleAutomation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskagup\\eclipse-workspace\\Training\\driver\\chromedriver.exe");  
		
		driver=new  ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hi");
	}
}