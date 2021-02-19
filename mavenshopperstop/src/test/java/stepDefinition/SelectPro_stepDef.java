package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SelectProduct;

public class SelectPro_stepDef 
{
	SelectProduct sp = new SelectProduct();
	
	@Given("^user is on shoppers stop homepage$")
    public void user_is_on_shoppers_stop_homepage() throws Throwable 
	{
        sp.open_url();
    }

    @When("^user clicks beauty$")
    public void user_clicks_beauty() throws Throwable 
    {
    	sp.select_product();
    }

    @Then("^display bb cc creams$")
    public void display_bb_cc_creams() throws Throwable 
    {
        sp.valiate_title();
    }

    @And("^select bb cc cream$")
    public void select_bb_cc_cream() throws Throwable 
    {
        
    }

}
