import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BinarySearchJUnitTests {

    @Test public void testOneElementIsInSequence() {
        int key = 3;
        int[] seq = {3};
        boolean testValue = true;
        SearchResult searchResult;
        searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(seq[searchResult.getPosition()], is(key));
    }

    @Test public void testOneElementIsNotInSequence() {
        int key = 3;
        int[] seq = {2};
        boolean testValue = false;
        int testPosition = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(searchResult.getPosition(), is(testPosition));

    }

    @Test public void testIsFirstInSequence() {
        int key = 3;
        int[] seq = {3, 4, 5};
        boolean testValue = true;
        int testPosition = 0;
        SearchResult searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(searchResult.getPosition(), is(testPosition));
    }

    @Test public void testIsLastInSequence() {
        int key = 5;
        int[] seq = {3, 4, 5};
        boolean testValue = true;
        int testPosition = seq.length - 1;
        SearchResult searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(searchResult.getPosition(), is(testPosition));
    }

    @Test public void testIsInTheMiddleOfSequence() {
        int key = 5;
        int[] seq = {3, 4, 5, 6, 7};
        boolean testValue = true;
        boolean hasOddLength = seq.length % 2 != 0;
        int middlePosition = (seq.length - 1) / 2;

        SearchResult searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(hasOddLength, is(testValue));
        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(searchResult.getPosition(), is(middlePosition));

    }

    @Test public void testIsNotInTheSequence() {
        int key = 2;
        int[] seq = {3, 4, 5, 6, 7};
        boolean testValue = false;
        int testPosition = -1;

        SearchResult searchResult = BinarySearch.search(key, seq);

        Assert.assertThat(searchResult.isFound(), is(testValue));
        Assert.assertThat(searchResult.getPosition(), is(testPosition));

    }

    @Test(expected = IllegalArgumentException.class) public void testEmptySequence() {
        BinarySearch.search(0, new int[0]);
    }

}
