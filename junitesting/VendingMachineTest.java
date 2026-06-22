package com.src.junitesting;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class VendingMachineTest {

    @Test
    void shouldReturn13NotesFor2489() {
        int actual = VendingMachine.findNotes(2489, 0);
        assertEquals(13, actual);
    }

    @Test
    void shouldReturn1NotesFor1000(){
        int actual = VendingMachine.findNotes(1000, 0);
        assertEquals(1,actual);
    }
}