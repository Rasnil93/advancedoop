import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestFilterTest {

    @Test
    void testFilter(){
        TestFilter test = new TestFilter();

        String testArr[] = {"this", "is", "a", "test"};

        testArr = Filter.filter(testArr,test);

        assertEquals(Arrays.asList("is", "a"), Arrays.asList(testArr));
    }

}