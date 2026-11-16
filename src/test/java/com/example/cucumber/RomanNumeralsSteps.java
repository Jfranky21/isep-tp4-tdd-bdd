package com.example.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.RomanNumerals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RomanNumeralsSteps {

    private final RomanNumerals romanNumerals = new RomanNumerals();
    private int number;
    private String result;

    @Given("the number {int}")
    public void the_number(int number) {
        this.number = number;
    }

    @When("I convert it to Roman numerals")
    public void i_convert_it_to_roman_numerals() {
        result = romanNumerals.toRoman(number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}