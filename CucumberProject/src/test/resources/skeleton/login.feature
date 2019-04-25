Feature: Login Feature
@valid
Scenario Outline:Valid User Scenario
 
    Given The URL of TestMeApp
    When user enters <username> as username
    And user enters <password> as password
    Then user is in <page>
    
    
Examples:
   |username|password|page|
   |Lalitha|Password123|Home|
   |admin|Password456|Admin Home|
   
   @invalid
Scenario: invalid scenario
    Given The URL of TestMeApp
    When user enters invalid data
    |rachana|rachu123|
    |Lalitha|Password456|
    |rachana|rach679|
    Then user is in loginpage
    |afdg|
    |adsf|
    |ad|
             
