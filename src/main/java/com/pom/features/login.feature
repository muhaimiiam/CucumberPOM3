Feature: Login

  Scenario Outline: Validate Login functionality
    Given user is on Ecommerce website
    When user click on sign in button
    Then user is directed to login page
    When user enter <username> and <password>
    Then user is directed to homepage
    When user click on sign out button
    Then user is logout

    Examples: 
      | username                 | password  |
      | testmu001@gmail.com      | Muh41m1n  |
      | testmu001@mailinator.com | Muh41m1n1 |
      | testmu001@mailinator.com | Muh41m1n  |
      
  #Scenario: User enter incorect username and incorrect password
  #	Given user is on Ecommerce website
  #	When user click on sign in button
    #Then user is directed to login page
    #When user enter username and password
    #Then user is directed to homepage
    #When user click on sign out button
    #Then user is logout    
