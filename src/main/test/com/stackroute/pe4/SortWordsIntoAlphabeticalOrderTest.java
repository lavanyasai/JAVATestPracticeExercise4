package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsIntoAlphabeticalOrderTest {

    SortWordsIntoAlphabeticalOrder sortWordsIntoAlphabeticalOrder;
    String[] expectedResult;
    String[] actualResult;
    @Before
    public void setUp() throws Exception {
        sortWordsIntoAlphabeticalOrder = new SortWordsIntoAlphabeticalOrder();
    }

    @Test
    public void givenStringReturnsSortedString() {
        actualResult = sortWordsIntoAlphabeticalOrder.generateSortedString("Stackroute Office");
        expectedResult = new String[]{"office", "stackroute"};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenIntegerStringsReturnsSortedIntegerStrings() {
        actualResult = sortWordsIntoAlphabeticalOrder.generateSortedString("12 0 54 76");
        expectedResult = new String[]{"0", "12", "54", "76"};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullReturnNullString() {
        actualResult = sortWordsIntoAlphabeticalOrder.generateSortedString("");
        expectedResult = new String[]{""};
        assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        sortWordsIntoAlphabeticalOrder = null;
    }
}