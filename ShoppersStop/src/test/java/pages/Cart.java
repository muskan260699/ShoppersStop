package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BeautyBase;

public class Cart extends BeautyBase {

	@FindBy(xpath="//img[@src='https://sslimages.shoppersstop.com/sys-master/images/h84/hbb/14877474324510/7462843_9999.jpg_230Wx334H']") WebElement loreal;
	@FindBy(xpath="//input[@value='Add to bag']") WebElement add;
	@FindBy(xpath="//li[@aria-hidden='false']/a[@data-slide-index='1']") WebElement img;
	@FindBy(xpath="//a[text()='My Bag']") WebElement mycart;
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	
	public void product() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", loreal);
		loreal.click();
	}
	
	public void addtocart() throws Exception {
		img.click();
		Thread.sleep(5000);
		add.click();
		Thread.sleep(5000);
	}
	
	public void verifycart() throws Exception {
		new Actions(driver).moveToElement(mycart).click().perform();
		Thread.sleep(5000);
		String str=driver.getTitle();
		if(str.contains("Your Shopping Bag"))
			System.out.println("***In my cart");
		else
			System.out.println("***NOT In my cart");
	}
}
