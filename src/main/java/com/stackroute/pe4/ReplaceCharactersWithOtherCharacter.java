package com.stackroute.pe4;

/*
Replaces all d with f and all l with t in the given string.
 */

public class ReplaceCharactersWithOtherCharacter {
    String replaceCharacters(String inputString) {
        inputString = inputString.replaceAll("d", "f");
        inputString = inputString.replaceAll("l", "t");
        return inputString;
    }
}
