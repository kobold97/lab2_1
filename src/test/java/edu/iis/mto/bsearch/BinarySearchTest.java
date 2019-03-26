package edu.iis.mto.bsearch;


import org.junit.Test;
import org.junit.Assert;

public class BinarySearchTest {

    @Test
    public void shouldReturnTrueIfElementIsFoundInOneElementSequence() {
        int[] seq = {1};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void shouldReturnFalseIfElementIsNotFoundInOneElementSequence() {
        int[] seq = {2};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertFalse(sr.isFound());
    }
}