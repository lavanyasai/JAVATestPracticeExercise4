package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Finds multiple occurrences of the given word in a string using Matcher methods.
 */

public class MultipleOccurrencesOfTheWordUsingRegex {
    public String findOccurrencesOfWordInTheString(String inputString, String word) {
        String result = "";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(inputString);
        while(matcher.find()) {
            result = result + matcher.start() + " - " + matcher.end() + " ";
        }
        return result.trim();
    }
}
