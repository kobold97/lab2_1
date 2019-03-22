package edu.iis.mto.bsearch;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SearchResultTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test public void shouldReturnTrueIfOneElementExistsInOnlyOneElementSequence() {
        int[] sequence = {15};
        int key = 15;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(true, is(searchResult.isFound()));
    }

    @Test public void shouldReturnFalseIfThereIsNoKeyElementInSequence() {
        int[] sequence = {15};
        int key = 14;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(false, is(searchResult.isFound()));
    }

    @Test public void shouldReturnTrueIfKeyElementIsFirstInSequence() {
        int[] sequence = {20, 25, 30, 35};
        int key = 20;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(1, is(searchResult.getPosition()));
    }

    @Test public void shouldReturnTrueIfKeyElementIsLastInSequence() {
        int[] sequence = {20, 25, 30, 35};
        int key = 35;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(sequence.length, is(searchResult.getPosition()));
    }

    @Test public void shouldReturnTrueIfKeyElementIsInTheMiddleOfSequence() {
        int[] sequence = {20, 25, 30, 35, 40};
        int key = 30;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(sequence.length / 2 + 1, is(searchResult.getPosition()));
    }

    @Test public void shouldReturnFalseIfKeyElementIsNotInSequence() {
        int[] sequence = {20, 25, 30, 35, 40, 45, 50};
        int key = 55;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(false, is(searchResult.isFound()));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionIfInitialSequenceIsEmpty() {
        int[] sequence = {};
        int key = 5;
        exception.expect(IllegalArgumentException.class);
        BinarySearch.search(key, sequence);
    }

    @Test
    public void shouldReturnMinusOneIfKeyElementIsNotFoundOnSpecificPosition() {
        int[] sequence = {5, 10, 15, 20, 25};
        int key = 30;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(-1, is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnCorrectPositionOfFoundElementInSequence() {
        int[] sequence = {5, 10, 15, 20, 25, 30};
        int key = 15;

        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(3, is(searchResult.getPosition()));
    }

    @Test
    public void shouldReturnTrueIfBothSearchResultsAreEqual() {
        int[] sequence = {5, 10, 15, 20, 25, 30};
        int key = 15;

        SearchResult firstSearchResult = BinarySearch.search(key, sequence);
        SearchResult secondSearchResult = BinarySearch.search(key, sequence);

        assertThat(firstSearchResult, is(secondSearchResult));
    }
}
