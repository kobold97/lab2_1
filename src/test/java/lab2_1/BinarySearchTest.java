package lab2_1;

import org.junit.Test;
import org.junit.Assert;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testSearchResult_seqLengthIsOne_keyInSeq() {
		int key = 1;
		int[] seq = { 1 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(1, searchResult.getPosition());
	}

	@Test
	public void testSearchResult_seqLengthIsOne_noKeyInSeq() {
		int key = 5;
		int[] seq = { 1 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(-1, searchResult.getPosition());
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsFirstElementInSeq() {
		int key = 1;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(1, searchResult.getPosition());
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsMiddleElementInSeq() {
		int key = 3;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(3, searchResult.getPosition());
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_keyIsLastElementInSeq() {
		int key = 5;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(5, searchResult.getPosition());
	}

	@Test
	public void testSearchResult_seqLengthGreaterThanOne_noKeyInSeq() {
		int key = 6;
		int[] seq = { 1, 2, 3, 4, 5 };

		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertEquals(-1, searchResult.getPosition());
	}
}
