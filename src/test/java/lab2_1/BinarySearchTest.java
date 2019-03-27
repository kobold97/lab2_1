package lab2_1;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testSearchResult_seqLengthIsOne_keyInSeq() {
		int key = 1;
		int[] seq = { 1 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.getPosition(), is(0));
	}

	@Test
	public void testSearchResult_seqLengthIsOne_noKeyInSeq() {
		int key = 5;
		int[] seq = { 1 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.isFound(), is(false));
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsFirstElementInSeq() {
		int key = 1;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.getPosition(), is(0));
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsMiddleElementInSeq() {
		int key = 7;
		int[] seq = { 1, 2, 7, 10, 11 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.getPosition(), is(2));
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsLastElementInSeq() {
		int key = 5;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.getPosition(), is(seq.length-1));
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_noKeyInSeq() {
		int key = 6;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertThat(searchResult.isFound(), is(false));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSearchResult_emptySequence() {
		int key = 2;
		int[] seq = {};

		SearchResult searchResult = BinarySearch.search(key, seq);
		searchResult.toString();
	}
}
