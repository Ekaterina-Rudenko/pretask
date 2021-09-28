package by.epam.pretask.validator;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StringFilterTest {

    String[] testArray = {"123","0.45","-45.6",".67"," ",".","-456","56.7","jfgsf",".","0","56..3"};

    @Test
    public void testFilterOfDoubleTokens() {
        String[] actual = StringFilter.filterOfDoubleTokens(testArray);
        String[] expected = {"123", "0.45", "-45.6", ".67", "-456", "56.7", "0"};
        assertEquals(actual, expected);
    }
}