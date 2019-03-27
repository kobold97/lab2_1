package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    private int key;
    private int[] seq;

    @Before public void setUp() throws Exception {
        key = 1;
    }

    @Test public void keyIsInSeq() {
        seq = new int[]{key};
        assertThat(true,is(BinarySearch.search(key,seq).isFound()));
    }

    @Test public void keyNotInSeq() {
        seq = new int[]{3};
        assertThat(false,is(BinarySearch.search(key,seq).isFound()));
    }

    @Test public void keyIsFirstKeyInSeq() {
        seq = new int[]{key,2,3};
        assertThat(1,is(BinarySearch.search(key,seq).getPosition()));
    }

    @Test public void KeyIsLastKeyInSeq() {
        key = 4;
        seq = new int[]{1,2,3,key};
        assertThat(4,is(BinarySearch.search(key,seq).getPosition()));
    }

    @Test public void KeyIsCenterKeyInSeq() {
        key = 3;
        seq = new int[]{1,2,key,6,7};
        assertThat(3,is(BinarySearch.search(key,seq).getPosition()));
    }

    @Test public void NoKeyInSeq() {
        seq = new int[]{2,3,4,10};
        assertThat(false,is(BinarySearch.search(key,seq).isFound()));
    }
}
