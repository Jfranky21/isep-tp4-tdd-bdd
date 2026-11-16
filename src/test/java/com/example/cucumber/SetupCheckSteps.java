package com.example.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/** Steps du scénario de vérification. À supprimer avec setup_check.feature avant le TP. */
public class SetupCheckSteps {

    private int a;
    private int b;
    private int result;

    @Given("I have the numbers {int} and {int}")
    public void i_have_the_numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @When("I add them")
    public void i_add_them() {
        result = a + b;
    }

    @Then("the sum should be {int}")
    public void the_sum_should_be(int expected) {
        assertEquals(expected, result);
    }
}
