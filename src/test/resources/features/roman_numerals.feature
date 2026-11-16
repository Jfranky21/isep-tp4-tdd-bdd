Feature: Roman numerals
  As a user
  I want to convert an integer into a Roman numeral

  Scenario Outline: Convert <number> to Roman numerals
    Given the number <number>
    When I convert it to Roman numerals
    Then the result should be "<roman>"

    Examples:
      | number | roman |
      | 1      | I     |
      | 2      | II    |
      | 3      | III   |
      | 4      | IV    |
      | 5      | V     |
      | 9      | IX    |
      | 10     | X     |