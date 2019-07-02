package com.stackroute.pe4;

/*
Counts the total number of occurrences of a given character in a string without using any loop.
 */

public class CountNumberOfOccurrences {
    public int generateNumberOfOccurrences(String inputString, char inputCharacter) {
        int numberOfTimes = 0;
        numberOfTimes = inputString.length() - inputString.replaceAll(String.valueOf(inputCharacter), "").length();
        return numberOfTimes;
    }
}
