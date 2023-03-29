@regression
Feature: Testing the account creation and validation from SmartBear

  Scenario Outline: Validation account creation for different input

    Given User login with username,password and click Order Button
    And   User provides '<product>','<quantity>' for product information
    And   User provides '<name>','<street>','<city>','<state>','<zip>' for address information
    And   User provides '<card>','<cardNumber>','<expireDate>' for payment information
    Then  User clicks process button and validates '<message>'
    And   User validates all the information 'name','product,'quantity','date','street','city','state','zip','card','cardNumber','expireDate'
    Examples:
      | product | quantity | name     | street | city    | state | zip   | card | cardNumber | expireDate | message                                |
      | MyMoney | 5        | Saltanat | midway | Chicago | IL    | 60016 | VISA | 1223435656 | 06/25      | New order has been successfully added. |



