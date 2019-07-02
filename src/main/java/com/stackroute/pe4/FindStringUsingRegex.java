package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Finds the presence of Harry in a string using Regular Expression.
 */

public class FindStringUsingRegex {
    public boolean checkForHarryInTheGivenString(String inputString) {
        boolean result = false;
        Pattern pattern = Pattern.compile("[a-zA-Z ]* Harry [a-zA-Z ]*");
        Matcher matcher = pattern.matcher(inputString);
        if(matcher.find()) {
            System.out.println(matcher.group());
            result = true;
        }
        return result;
    }
}
