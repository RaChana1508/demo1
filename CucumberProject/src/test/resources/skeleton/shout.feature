Feature: Shout Feature
Scenario: Sean shouts
 	Given Sean is 10 meters away from lucia
	When Sean shouts "Free Coffee"
	Then Lucia "listens" to the message

Scenario: Sean shouts away from lucia
    Given Sean is 100 meters away from lucia
    When Sean shouts "Free Coffee"
    Then  Lucia "cannot listen" to the message
