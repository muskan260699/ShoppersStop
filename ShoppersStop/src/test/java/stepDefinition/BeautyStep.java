package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Beauty;
import pages.Cart;

public class BeautyStep {
	
	Beauty b=new Beauty();
	Cart c=new Cart();
	@Given("^user is on shoperstop homepage$")
	public void user_is_on_shoperstop_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    b.openurl();
	}

	@When("^user clicks on beauty$")
	public void user_clicks_on_beauty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    b.openBeauty();
	}

	@When("^choose BB & CC creams$")
	public void choose_BB_CC_creams() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^BB & CC creams page is displayed$")
	public void bb_CC_creams_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    b.title();
	}
	
	@Given("^user is on BB & CC creams page$")
	public void user_is_on_BB_CC_creams_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user select a product$")
	public void user_select_a_product() throws Throwable {
	    c.product();	    
	}

	@When("^click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
		c.addtocart();
	}

	@Then("^my cart page is displayed$")
	public void my_cart_page_is_displayed() throws Throwable {
	    c.verifycart();
	    
	}

}
