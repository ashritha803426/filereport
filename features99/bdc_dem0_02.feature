Feature: BDC validation on demowebshop
@Regression
Scenario: Registered user acsess to cart in DemoWebshop
Given user launched demo webshop app in chrome browser
Then user searches  for the item of his choice
And adds that item to the cart

 @Sanity
 Scenario: Registered user access track the ordered item in DemoWebshop
 Given user has already placed an order for his favorite item
 And user tries to access the order tracking dashboard
 Then identifies the state of the order