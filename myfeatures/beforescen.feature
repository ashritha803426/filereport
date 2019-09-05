Feature: mydemoapp
Background: Clearing the browser cache
 Given I am clicking the shortcut for browser cache
And ensuring for deletin of all teh cookies 

Scenario: User login into demoWEbshop from BDC
Given bdc user having valid credentials
And user tries providing  the data for the login process

Scenario: user logout process for the bdc user
Given bdc user is able to see the logout button
Then user clicks on the logout button to close the window

