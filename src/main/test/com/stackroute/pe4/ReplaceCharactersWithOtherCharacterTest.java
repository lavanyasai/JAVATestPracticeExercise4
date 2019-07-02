package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersWithOtherCharacterTest {

    ReplaceCharactersWithOtherCharacter replaceCharactersWithOtherCharacter;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        replaceCharactersWithOtherCharacter = new ReplaceCharactersWithOtherCharacter();
    }

    @Test
    public void givenStringReplaceCharactersWithOtherCharacter() {
        actualResult = replaceCharactersWithOtherCharacter.replaceCharacters("daily dry");
        expectedResult = "faity fry";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberStringReturnsTheSameString() {
        actualResult = replaceCharactersWithOtherCharacter.replaceCharacters("1234");
        expectedResult = "1234";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullStringReturnsNullString() {
        actualResult = replaceCharactersWithOtherCharacter.replaceCharacters("");
        expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        replaceCharactersWithOtherCharacter = null;
    }
}