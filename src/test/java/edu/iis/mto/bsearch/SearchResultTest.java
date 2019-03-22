package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchResultTest {
    
    @Test
    public void shouldReturnTrueIfKeyIsInOneElementSequence() {
        int[] seq = {1};
        int key = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    public void shouldReturnFalseIfKeyIsNotInOneElementSequence() {
        int[] seq = {1};
        int key = 9;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }

    @Test
    public void shouldReturnTrueIfKeyIsInSequenceOnFirstPosition() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfKeyIsInSequenceOnLastPosition() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 6;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertEquals(seq.length, searchResult.getPosition());
    }

    @Test
    public void shouldReturnFalseIfKeiIsNotInSequence() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 9;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }

    @Test
    public void shouldReturnFalseIfSequenceIsEmpty() {
        int[] seq = {};
        int key = 6;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertFalse(searchResult.isFound());
    }

}