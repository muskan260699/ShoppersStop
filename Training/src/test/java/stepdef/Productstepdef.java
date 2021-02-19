package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Products;

public class Productstepdef {
	
	Products p=new Products();
	@Given("^user is on shoppers stop site$")
	public void user_is_on_shoppers_stop_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    p.sitesearch();
	}

	@When("^hover on any tab$")
	public void hover_on_any_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   p.hover();
	}

	@When("^clicked on any one product$")
	public void clicked_on_any_one_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user should be navigated to the chosen product$")
	public void user_should_be_navigated_to_the_chosen_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    p.navigate();
	}
}
