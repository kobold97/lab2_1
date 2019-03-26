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

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheBeginning() {
        int[] seq = {1, 2, 3, 4};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheEnd() {
        int[] seq = {1, 2, 3, 4};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheMiddle() {
        int[] seq = {1, 2, 3, 4};
        SearchResult sr = BinarySearch.search(2, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test
    public void shouldReturnFalseIfElementIsNotFound() {
        int[] seq = {1, 2, 3, 4};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertFalse(sr.isFound());
    }
}