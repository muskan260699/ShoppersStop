@shop
Feature: Beauty Page
	
	@beauty
	Scenario: Visit beauty page
	Given user is on shoperstop homepage
	When user clicks on beauty
	And choose BB & CC creams
	Then BB & CC creams page is displayed
	
	@tocart
	Scenario: Add a product to cart
	Given user is on BB & CC creams page
	When user select a product 
	And click on add to cart
	Then my cart page is displayed