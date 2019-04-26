Feature: addCart Feature
Scenario: Add one product and payment to successful order
     When  larry added a headphone to the cart 
    And  checkout and fill transaction details
    Then product is ordered successfully.