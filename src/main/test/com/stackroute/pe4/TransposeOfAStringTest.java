package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfAStringTest {

    private TransposeOfAString transposeOfAString;
    private String expectedResult;
    private String actualResult;

    @Before
    public void setUp() throws Exception {
        transposeOfAString = new TransposeOfAString();
    }

    @Test
    public void givenStringReturnsTransposedString() {
        expectedResult = transposeOfAString.performTransposeOfAString("a quick brown fox jumps over the lazy dog");
        actualResult = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumbersReturnsTransposedNumberString() {
        expectedResult = transposeOfAString.performTransposeOfAString("12 32 54 89");
        actualResult = "21 23 45 98";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullReturnsNullString() {
        expectedResult = transposeOfAString.performTransposeOfAString("");
        actualResult = "";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        transposeOfAString = null;
    }
}