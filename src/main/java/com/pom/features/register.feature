Feature: Registration

  Scenario Outline: Validate registration functionality
    Given user is on Ecommerce website
    When user click on sign in button
    Then user is directed to login page
    Then user enter email <email>
    Then user is directed to the registration page
    Then user fill personal information <cusFM> and <cusLN> and <password> and <company> and <address1> and <address2> and <city> and <postcode> and <addinfo> and <homePhone> and <mobilePhone>
    Then user is successfully registered

    Examples: 
      | email                    | cusFM | cusLN | password | company | address1      | address2  | city  | postcode | addinfo       | homePhone | mobilePhone |
      | testmu004@mailinator.com | Adam  | Fahri | test@123 | PT. ABC | Avenue Street | A&B Tower | Tokyo |    12114 | Test register | 021878281 |  0867827817 |
      #| testmu002mailinator.com  | Muhammad | Hilmi | test@123 | PT. ABC | Avenue Street | A&B Tower | Tokyo |     1211 | Test register | 021878281 |  0867827817 |
      #| testmu001@mailinator.com | Fikri    | Adli  | test@123 | PT. ABC | Avenue Street | A&B Tower | Tokyo |     1211 | Test register | 021878281 |  0867827817 |
      #| testmu002@mailinator.com | Aisyah   | Fatma | test@123 | PT. ABC | Avenue Street | A&B Tower | Tokyo |     1211 | Test register | 021878281 |  0867827817 |
