import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

    @Test
    public void seqLengthIsEqual1AndIsInSeq() {
        int[] seq = {7};
        SearchResult result = BinarySearch.search(7, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertEquals(result.getPosition(), 1);
    }

    @Test
    public void seqLengthIsEqual1AndIsNotInSeq() {
        int[] seq = {7};
        SearchResult result = BinarySearch.search(3, seq);
        Assert.assertFalse(result.isFound());
        Assert.assertEquals(result.getPosition(), -1);
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsFirstElement() {
        int[] seq = {7, 8, 9, 10};
        SearchResult result = BinarySearch.search(7, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertEquals(result.getPosition(), 1);
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsLastElement() {
        int[] seq = {4, 5, 6, 7};
        SearchResult result = BinarySearch.search(7, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertEquals(result.getPosition(), 4);
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsMiddleElement() {
        int[] seq = {6, 7, 8};
        SearchResult result = BinarySearch.search(7, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertEquals(result.getPosition(), 2);
    }

    @Test
    public void seqLengthIsGreaterThen1AndIsNotInSeq() {
        int[] seq = {6, 7, 8};
        SearchResult result = BinarySearch.search(9, seq);
        Assert.assertFalse(result.isFound());
        Assert.assertEquals(result.getPosition(), -1);
    }
}
