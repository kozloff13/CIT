package com.cit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectoryTest {

    @Test
    public void trueNumbersInReturn() {
        Directory directory = new Directory();
        String actual = directory.inReturn("Иванов И.И.");
        String expected = directory.ivanov.toString();
        assertEquals(actual, expected);
    }

    @Test
    public void nonexistentAbonent() {
        Directory directory = new Directory();
        String actual = directory.inReturn("John Snow");
        String expected = "Такого абонента не существует";
        assertEquals(actual, expected);
    }
}