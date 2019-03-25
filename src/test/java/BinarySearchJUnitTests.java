import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchJUnitTests {

    @Test public void testOneElementIsInSequence() {
        int key = 3;
        int[] seq = {3};
        boolean testValue = true;
        SearchResult searchResult;
        searchResult = BinarySearch.search(key, seq);

        Assert.assertEquals(testValue, searchResult.isFound());
        Assert.assertEquals(key, seq[searchResult.getPosition()]);
    }

}
