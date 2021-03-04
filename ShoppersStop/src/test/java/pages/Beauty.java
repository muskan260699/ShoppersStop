package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BeautyBase;

public class Beauty extends BeautyBase {
	
	static @FindBy(xpath="//a[text()='BEAUTY']") WebElement beauty;
	static @FindBy(linkText="BB & CC Cream") WebElement bb;
	static @FindBy(linkText="Make Up") WebElement makeup;
	
	
	public Beauty() {
		PageFactory.initElements(driver, this);
	}
	
	public void openurl() {
		driver.get(prop.getProperty("url"));
	}
	
	public void openBeauty() {
		new Actions(driver).moveToElement(beauty).perform();
		new Actions(driver).moveToElement(makeup).perform();
		bb.click();
	}
	
	public void title() {
		String str=driver.getTitle();
		if(str.contains("BB & CC"))
			System.out.println("BB & CC products page displayed");
		else
			System.out.println("**BB & CC products page NOT displayed");
	}
}
