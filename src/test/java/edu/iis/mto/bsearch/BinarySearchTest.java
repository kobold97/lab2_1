package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int key;
    private int[] seq;

    @Before public void setUp() throws Exception {
        key = 1;
    }

    @Test public void keyIsInSeq() {
        seq = new int[]{key};
        assertEquals(true,BinarySearch.search(key,seq).isFound());
    }

    @Test public void keyNotInSeq() {
        seq = new int[]{3};
        assertEquals(false,BinarySearch.search(key,seq).isFound());
    }

    @Test public void keyIsFirstKeyInSeq() {
        seq = new int[]{key,2,3};
        assertEquals(1,BinarySearch.search(key,seq).getPosition());
    }
}
