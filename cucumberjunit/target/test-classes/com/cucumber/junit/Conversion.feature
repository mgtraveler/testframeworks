Feature: Convert between different units of temperature

  Formula: C/5 = (F - 32)/9
  C = 5(F - 32)/9 = 5(98.6 - 32 =)/9 = 37

  Scenario: Convert to Celsius from Farenheit
    Given I want to convert 96.8 degree Fahrenheit to Celsius
    When I input the value of Fahrenheit as 96.8 in text field
    Then It should be converted to Celsius as 37 degree