package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/** Tests de PrimeChecker, écrits avant le code (TDD rouge/vert/bleu). */
public class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void test0IsNotPrime() {
        assertFalse(primeChecker.isPrime(0), "0 should not be considered a prime number");
    }
}
