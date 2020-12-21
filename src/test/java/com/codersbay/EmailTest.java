package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailTest {

    @Test
    public void testIfAnEmailIsNull() {
        EmailChecker emailChecker = new EmailChecker(null);
        assertEquals(null, emailChecker.getEmail());
    }

    @Test
    public void testIfAnEmailIsEmpty() {
        EmailChecker emailChecker = new EmailChecker("");
        assertEquals(0, emailChecker.getEmail().length());
    }
}
