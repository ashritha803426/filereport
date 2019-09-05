Feature: Guest user actions in Demo WebShop
@Sanity
Scenario: Users chice to opt for an account 
Given user access the signup page
And gets the credentials

@Regression
Scenario: User access to login page of the Demo Webshop
Given user has valid account creds for DemoWebShop
And provide the valid creds as inputs for the login process
Then verifies the state for the login status