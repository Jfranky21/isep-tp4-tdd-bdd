package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/** Vérifie que JUnit 5 (dont @ParameterizedTest) fonctionne. À supprimer avant le TP. */
class SmokeTest {

    @Test
    void junitRuns() {
        assertEquals(4, 2 + 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void parameterizedRuns(int number) {
        assertEquals(number, number);
    }
}
