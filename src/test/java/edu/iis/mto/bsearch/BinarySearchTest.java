package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void onlyOneGoodElementIsInTheSequence() {
		int[] seq = { 1 };
		assertThat((BinarySearch.search(1, seq).isFound() == true && BinarySearch.search(1, seq).getPosition() == 0),
				is(true));
	}

	@Test
	public void onlyOneBadElementIsInTheSequence() {
		int[] seq = { 1 };
		assertThat((BinarySearch.search(2, seq).isFound() == false && BinarySearch.search(2, seq).getPosition() == -1),
				is(true));
	}

	@Test
	public void multipleElementsSequenceWithGoodElementAtTheBeggining() {
		int[] seq = { 1, 2, 3, 4 };
		assertThat((BinarySearch.search(1, seq).isFound() == true && BinarySearch.search(1, seq).getPosition() == 0),
				is(true));
	}

	@Test
	public void multipleElementsSequenceWithGoodElementInTheMiddle() {
		int[] seq = { 1, 2, 3, 4, 5 };
		assertThat((BinarySearch.search(3, seq).isFound() == true && BinarySearch.search(3, seq).getPosition() == 2),
				is(true));
	}

	@Test
	public void multipleElementsSequenceWithGoodElementAtTheEnd() {
		int[] seq = { 1, 2, 3, 4 };
		assertThat((BinarySearch.search(4, seq).isFound() == true && BinarySearch.search(4, seq).getPosition() == 3),
				is(true));
	}

	@Test
	public void multipleElementsSequenceWithBadElement() {
		int[] seq = { 1, 2, 3, 4 };
		assertThat((BinarySearch.search(8, seq).isFound() == false && BinarySearch.search(8, seq).getPosition() == -1),
				is(true));
	}

	@Test(expected = IllegalArgumentException.class)
	public void throwsIllegalArgumentException() {
		int[] seq = {};
		BinarySearch.search(2, seq);
	}

}
