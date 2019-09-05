Feature: mydemoapp
Background: the registered user logins to the app
 Given the user launches the Demowebshop app
 Then the user clicks on the login button
 And the user enters the data in the field provided
 Then clicks on the login button




Scenario: Add item to the cart
 Given the user clicks on the books category
 Then user the adds the fiction book to the cart
 And closes the app




Scenario: Add one more item to the cart
 Given the user clicks on the computer category 
 Then the user selects the build the own cheap computer to the cart
 And The user closes the app


