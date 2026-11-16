# Scénario de vérification de l'installation : à supprimer avant le TP
Feature: Setup check
  As a student
  I want to check that Cucumber runs in my environment
  So that I can start the Roman Numerals exercise

  Scenario: Cucumber executes a simple scenario
    Given I have the numbers 2 and 3
    When I add them
    Then the sum should be 5
