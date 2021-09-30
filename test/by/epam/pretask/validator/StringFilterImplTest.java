package by.epam.pretask.validator;

import by.epam.pretask.validator.impl.StringFilterImpl;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StringFilterImplTest {

    String testString = "123 0.45 -45.6 .67 . -456 56.7 jfgsf 0 56..3";

    @Test
    public void testFilterOfDoubleTokens() {
        StringFilter filter = new StringFilterImpl();
        String[] actual = filter.lineFilter(testString);
        String[] expected = {"123", "0.45", "-45.6", ".67", "-456", "56.7", "0"};
        assertEquals(actual, expected);
    }
}