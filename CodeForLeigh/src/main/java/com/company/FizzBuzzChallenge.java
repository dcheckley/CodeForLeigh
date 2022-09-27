package com.company;

public class FizzBuzzChallenge {

    public static String FizzBuzz(int number) {

        if(number <= 0) {
            return "";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBUZZ!";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return "";
    }

}