Feature: mydemoapp

  Scenario Outline: user registration
    Given Application is lauched by the guest user
    When User clicks on register link in the page
    And enter  firstname "<fname>" lastname "<lname>" email "<email>" password "<pswd>" confirm password "<cpswd>"
    Then user logout from the demowebapp

    Examples: 
      | fname    | lname  | email               | pswd        | cpswd       |
      | suma1    | uddan1 | sumauddan11111112@gmail.com |      123456 |      123456 |
      | ashritha | R      | ash111111112@gmail.com      | Password123 | Password123 |

  Scenario Outline: user logins to his account
    Given click on login link
    Then enter username "<username>" password "<passwrd>"

    Examples: 
      username            | passwrd    |

      | sumauddan11111112@gmail.com  |      123456 |
      |  ash111111112@gmail.com    | Password123 |

  Scenario: add to cart by searching
    Given search items to be added to he cart
    Then click on search item
    And add the item to cart
