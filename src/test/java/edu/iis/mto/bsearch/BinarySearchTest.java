package edu.iis.mto.bsearch;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class BinarySearchTest {

    private int key;
    private int[] seq;

    @Before
    public void setUp() throws Exception {
        key = 1;
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInOneElementSequence() {
        seq = new int[] {1};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(true, is(searchResult.isFound()));
    }

    @Test
    public void shouldReturnFalseIfElementIsNotFoundInOneElementSequence() {
        seq = new int[] {2};
        SearchResult searchResult = BinarySearch.search(1, seq);
        Assert.assertThat(false, is(searchResult.isFound()));
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheBeginning() {
        seq = new int[] {key, 2, 3, 4, 5};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(1, is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheEnd() {
        key = 5;
        seq = new int[] {1, 2, 3, 4, key};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(5, is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnTrueIfElementIsFoundInTheMiddle() {
        key = 3;
        seq = new int[] {1, 2, key, 4, 5};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(3, is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnFalseIfElementIsNotFound() {
        key = 0;
        seq = new int[] {1, 2, 3, 4, 5};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(false, is(searchResult.isFound()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfSequenceIsEmpty() {
        seq = new int[0];
        BinarySearch.search(key, seq);
    }

    @Test
    public void shouldReturnFalseIfSequenceIsNotSorted() {
        int[] seq = {5, 2, 3, key, 9, 8};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(false, is(searchResult.isFound()));
    }
}