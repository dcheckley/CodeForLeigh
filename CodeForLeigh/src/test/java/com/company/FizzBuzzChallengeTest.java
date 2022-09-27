package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzChallengeTest {

    @Test
    void fizzBuzzTest() {

        assertEquals("FIZZBUZZ!", FizzBuzzChallenge.FizzBuzz(15));

    }

    @Test
    void fizzTest() {

        assertEquals("Fizz", FizzBuzzChallenge.FizzBuzz(3));

    }

    @Test
    void buzzTest() {

        assertEquals("Buzz", FizzBuzzChallenge.FizzBuzz(5));

    }

    @Test
    void zeroTest() {

        assertEquals("", FizzBuzzChallenge.FizzBuzz(0));

    }

    @Test
    void normalNumberTest() {

        assertNotEquals("FIZZBUZZ!", FizzBuzzChallenge.FizzBuzz(7));



    }

}