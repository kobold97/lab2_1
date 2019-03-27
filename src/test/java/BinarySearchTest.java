import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

    @Test
    public void seqLengthIsEqual1AndIsInSeq() {
        int[] seq = {7};
        SearchResult result = BinarySearch.search(7, seq);
        assertThat(result.getPosition(), is(0));
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void seqLengthIsEqual1AndIsNotInSeq() {
        int[] seq = {7};
        SearchResult result = BinarySearch.search(3, seq);
        assertThat(result.getPosition(), is(-1));
        assertThat(result.isFound(), is(false));
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsFirstElement() {
        int[] seq = {7, 8, 9, 10};
        SearchResult result = BinarySearch.search(7, seq);
        assertThat(result.getPosition(), is(0));
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsLastElement() {
        int[] seq = {4, 5, 6, 7};
        SearchResult result = BinarySearch.search(7, seq);
        assertThat(result.getPosition(), is(3));
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsMiddleElement() {
        int[] seq = {6, 7, 8};
        SearchResult result = BinarySearch.search(7, seq);
        assertThat(result.getPosition(), is(1));
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsNotInSeq() {
        int[] seq = {6, 7, 8};
        SearchResult result = BinarySearch.search(9, seq);
        assertThat(result.getPosition(), is(-1));
        assertThat(result.isFound(), is(false));
    }
}
