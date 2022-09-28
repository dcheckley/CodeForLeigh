package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzChallengeTest {

    @Test
    void fizzBuzzTest() {

        assertEquals("FIZZBUZZ!", FizzBuzzChallenge.fizzBuzz(15));

    }

    @Test
    void fizzTest() {

        assertEquals("Fizz", FizzBuzzChallenge.fizzBuzz(3));

    }

    @Test
    void buzzTest() {

        assertEquals("Buzz", FizzBuzzChallenge.fizzBuzz(5));

    }

    @Test
    void zeroTest() {

        assertEquals("", FizzBuzzChallenge.fizzBuzz(0));

    }

    @Test
    void normalNumberTest() {

        assertNotEquals("FIZZBUZZ!", FizzBuzzChallenge.fizzBuzz(7));

    }

}