package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrencesOfTheWordUsingRegexTest {

    MultipleOccurrencesOfTheWordUsingRegex multipleOccurrencesOfTheWordUsingRegex;
    String expectedResult;
    String actualResult;
    @Before
    public void setUp() throws Exception {
        multipleOccurrencesOfTheWordUsingRegex = new MultipleOccurrencesOfTheWordUsingRegex();
    }

    @Test
    public void givenStringAndWordReturnOccurrencesOfTheWordInTheString() {
        String expectedResult = multipleOccurrencesOfTheWordUsingRegex.findOccurrencesOfWordInTheString("She sells seashells by the seashore", "se");
        String actualResult = "4 - 6 10 - 12 27 - 29";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringAndWordReturnOneOccurrencesOfTheWordInTheString() {
        String expectedResult = multipleOccurrencesOfTheWordUsingRegex.findOccurrencesOfWordInTheString("sells", "se");
        String actualResult = "0 - 2";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringAndWordReturnsNoOccurrences() {
        String expectedResult = multipleOccurrencesOfTheWordUsingRegex.findOccurrencesOfWordInTheString("This is Harry", "se");
        String actualResult = "";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurrencesOfTheWordUsingRegex = null;
    }
}