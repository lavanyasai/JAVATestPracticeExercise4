package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CountNumberOfOccurrencesTest {

    CountNumberOfOccurrences countNumberOfOccurrences;
    int expectedResult;
    int actualResult;

    @Before
    public void setUp() throws Exception {
        countNumberOfOccurrences = new CountNumberOfOccurrences();
    }

    @Test
    public void givenStringReturnsNumberOfOccurrencesOfGivenCharacter() {
        actualResult = countNumberOfOccurrences.generateNumberOfOccurrences("Java", 'a');
        expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringReturnsZeroOccurrencesOfGivenCharacter() {
        actualResult = countNumberOfOccurrences.generateNumberOfOccurrences("Java", 'p');
        expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsZeroOccurrencesOfGivenCharacter() {
        actualResult = countNumberOfOccurrences.generateNumberOfOccurrences("", ' ');
        expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        countNumberOfOccurrences = null;
    }
}