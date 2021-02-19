package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.SSbase;
import cucumber.api.cli.Main;

public class Products extends SSbase{
	static @FindBy(xpath="//input[@name='q']") WebElement search;
	//static @FindBy(linkText="Shoppers Stop") WebElement site;
	@FindBy(xpath="//a[text()='BEAUTY']") WebElement hoverbeauty;
	//static @FindBy(linkText="Make Up") WebElement makeup;
	//static @FindBy(linkText="BB & CC Cream") WebElement bnc;
	static @FindBy(linkText="BB & CC Cream") WebElement bnc;
	static @FindBy(linkText="Make Up") WebElement makeup;
	public Products() {
		PageFactory.initElements(d, this);
	}
	
	public void sitesearch() {
		// TODO Auto-generated method stub
		search.sendKeys("Shoppers Stop");
		search.sendKeys(Keys.ENTER);
		d.get("https://www.shoppersstop.com/");
	}
	
	public void hover() throws Exception {
		new Actions(d).moveToElement(hoverbeauty).perform();
		Thread.sleep(3000);
		new Actions(d).moveToElement(makeup).perform();
		bnc.click();
		Thread.sleep(3000);
	}
	public void navigate() {
		String s=d.getTitle();
		if(s.contains("Buy BB & CC ")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
			
		}
	}
}
