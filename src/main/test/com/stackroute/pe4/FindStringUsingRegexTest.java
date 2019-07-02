package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindStringUsingRegexTest {

    FindStringUsingRegex findStringUsingRegex;
    @Before
    public void setUp() throws Exception {
        findStringUsingRegex = new FindStringUsingRegex();
    }

    @Test
    public void givenStringWithHarryReturnsTrue() {
        assertTrue(findStringUsingRegex.checkForHarryInTheGivenString("This is Harry "));
    }

    @Test
    public void givenStringWithoutHarryReturnsFalse() {
        assertFalse(findStringUsingRegex.checkForHarryInTheGivenString("This is Henry "));
    }

    @Test
    public void givenStringWithoutSeperateHarryReturnsFalse() {
        assertFalse(findStringUsingRegex.checkForHarryInTheGivenString("This is HarryPotter "));
    }

    @After
    public void tearDown() throws Exception {
        findStringUsingRegex = null;
    }
}