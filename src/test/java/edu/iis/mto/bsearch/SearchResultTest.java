package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SearchResultTest {
    @Test
    public void shouldReturnTrueIfKeyIsInOneElementSequence() {
        int[] seq = {1};
        int key = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(true,is(searchResult.isFound()));
    }

    @Test
    public void shouldReturnFalseIfKeyIsNotInOneElementSequence() {
        int[] seq = {1};
        int key = 9;

        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(false,is(searchResult.isFound()));
    }

    @Test
    public void shouldReturnTrueIfKeyIsInSequenceOnFirstPosition() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 1;

        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(1,is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnTrueIfKeyIsInSequenceOnLastPosition() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 6;

        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(seq.length,is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnFalseIfKeiIsNotInSequence() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 9;

        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(false,is(searchResult.isFound()));
    }

    @Test
    public void shouldReturnTrueIfKeyIsInSequenceOnMidPosition() {
        int[] seq = {1, 2, 3, 4, 5, 6};
        int key = 3;


        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(seq.length/2,is(searchResult.getPosition()));
    }

}