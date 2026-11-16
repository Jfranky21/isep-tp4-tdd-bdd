package com.example;

public class PrimeChecker {

    private static final int SMALLEST_PRIME = 2;

    public boolean isPrime(int number) {
        if (number < SMALLEST_PRIME) {
            return false;
        }
        for (int divisor = SMALLEST_PRIME; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}