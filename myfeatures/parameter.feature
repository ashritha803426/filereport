Feature: Demo app111

  Scenario Outline: I want to check the multiple user access for login
    Given Launcing demowebapp
    Then click on login
    When enter username "<uname>" an password "<pswd>"
    And click on submit button
    Then verify user account

    Examples: 
      | uname                   | pswd        |
      | sumauddan1429@gmail.com | Suma-315    |
      | ash1@gmail.com          | Password123 |
