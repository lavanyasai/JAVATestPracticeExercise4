package com.stackroute.pe4;

import java.util.Arrays;

/*
Extracts words from string and sorts them into alphabetical order.
 */

public class SortWordsIntoAlphabeticalOrder {
    String[] generateSortedString(String s) {
        String[] splitString = s.toLowerCase().split(" ");
        Arrays.sort(splitString);
        return splitString;
    }
}
