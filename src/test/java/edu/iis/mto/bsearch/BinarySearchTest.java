package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int key;
    private int[] seq;

    @Test public void keyIsInSeq() {
        key = 1;
        seq = new int[]{key};
        assertEquals(true,BinarySearch.search(key,seq).isFound());
    }
}
