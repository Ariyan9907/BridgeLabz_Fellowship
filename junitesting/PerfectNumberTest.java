package com.src.junitesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void checkFor6() {
        boolean actual=PerfectNumber.checkPerfectNumber(6);
        assertTrue(actual);
    }

    @Test
    void checkFor28() {
        boolean actual=PerfectNumber.checkPerfectNumber(28);
        assertTrue(actual);
    }

    @Test
    void checkFor496() {
        boolean actual=PerfectNumber.checkPerfectNumber(496);
        assertTrue(actual);
    }

    @Test
    void checkFor8() {
        boolean actual=PerfectNumber.checkPerfectNumber(8);
        assertFalse(actual);
    }

    @Test
    void checkFor10() {
        boolean actual=PerfectNumber.checkPerfectNumber(10);
        assertFalse(actual);
    }
}