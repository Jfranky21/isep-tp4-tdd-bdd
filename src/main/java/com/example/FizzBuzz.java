package com.example;

public class FizzBuzz {

    public String convert(int number) {
        String result = "";
        if (isMultipleOf(number, 3)) {
            result += "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}