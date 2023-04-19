Feature: Test Homecenter
  I want to test the homecenter ecommerce website

  @TestJulian
  Scenario Outline: Registration and Login
    Given The <name> is on the homecenter home page
    When The user clicks on my account button
    And The user clicks on create sodimac account button
    And The user inserts the name <name> and surname <surname>
    And The user selects the type of document <typeOfDocument> and inserts the document <document>
    And The user inserts the phone <phone> and selects the type of taxpayer <taxpayer>
    And The user inserts the email <email> and password <password>
    And The user checks the terms and conditions
    And The user clicks on create my account button
    #Then The user validates the successful user creation

    Examples: 
      | name  | surname | typeOfDocument       |document    | phone      | taxpayer  | email              | password   |
      | david |  villa  | Cédula de Ciudadanía | 1007668669 | 3158587330 | No Aplica | davidv01@gmail.com |  julian123 |