package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test1Returns1() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void test2Returns2() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void test3ReturnsFizz() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void test5ReturnsBuzz() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    // ===== Étape 19 : cas de 1 à 100 générés avec l'IA (fichier fizzbuzz.csv) =====

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvFileSource(resources = "/fizzbuzz.csv", numLinesToSkip = 1)
    public void upTo100(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }
}