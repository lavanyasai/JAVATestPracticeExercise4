package com.stackroute.pe4;

/*
Transposes the given string.
 */

public class TransposeOfAString {
    public String performTransposeOfAString(String inputString) {
        String[] resultSplitString = inputString.split(" ");
        String result = "";
        for(int i=0; i<resultSplitString.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(resultSplitString[i]);
            result = result.concat(String.valueOf(stringBuilder.reverse())).concat(" ");
        }
        return result.trim();
    }
}
