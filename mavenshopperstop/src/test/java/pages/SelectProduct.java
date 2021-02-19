package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ShoppersStop_Base;

public class SelectProduct extends ShoppersStop_Base
{
	
	static @FindBy(xpath="//a[text()='BEAUTY']") WebElement Beauty;
	static @FindBy(xpath="//a[text()='BB & CC Cream']") WebElement BC_CC_Cream;
//	static @FindBy(linkText="BB & CC Cream") WebElement bb;
	static @FindBy(linkText="Make Up") WebElement Makeup;
	
	public SelectProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void open_url() throws Exception
	{
		driver.get(prop.getProperty("url"));
		Thread.sleep(10000);
	}

	public void select_product() throws Exception
	{
		new Actions(driver).moveToElement(Beauty).perform();
		new Actions(driver).moveToElement(Makeup).perform();
		Thread.sleep(2000);
		BC_CC_Cream.click();
		Thread.sleep(3000);
	}
	
	public void valiate_title()
	{
		String str = driver.getTitle();
		if(str.contains("BB & CC"))
			System.out.println("Displays BB & CC Creams page");
		else
			System.out.println("BB & CC Creams page not displayed");
	}
}
