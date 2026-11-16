# TP4 – TDD, BDD & GenAI in Testing

ISEP – Module Test & Test Automation (Capgemini) – 16/11/2026

**Binôme :** Joseph Frank KAMGANG TAKAM · William HU

## Exercices

| # | Exercice | Méthode | Fichiers |
|---|----------|---------|----------|
| 1 | PrimeChecker – nombre premier ou non | TDD rouge / vert / bleu, vérifié de 0 à 100 | `PrimeChecker.java`, `PrimeCheckerTest.java` |
| 2 | FizzBuzz | TDD rouge / vert / bleu, cas de 1 à 100 générés avec l'IA | `FizzBuzz.java`, `FizzBuzzTest.java` |
| 3 | Roman Numerals | BDD avec Cucumber (Gherkin), scénarios jusqu'à 1000 générés avec GitHub Copilot | `RomanNumerals.java`, `roman_numerals.feature`, `RomanNumeralsSteps.java` |

Chaque étape du cycle (RED, GREEN, BLUE) correspond à un commit : voir l'historique Git.

## Stack

Java 17 · Maven · JUnit 5 · Cucumber 7

## Lancer les tests

```bash
mvn clean test
```

Rapport Cucumber généré dans `target/cucumber-report.html`.