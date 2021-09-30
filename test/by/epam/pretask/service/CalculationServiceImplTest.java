package by.epam.pretask.service;

import by.epam.pretask.entity.CustomNumber;
import by.epam.pretask.service.impl.CalculationServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationServiceImplTest {

    private CalculationService calculation;
    private CustomNumber number1;
    private CustomNumber number2;
    private CustomNumber number3;

    @BeforeMethod
       public void setUp() {
           calculation = new CalculationServiceImpl();
           number1 = new CustomNumber(12.5);
           number2 = new CustomNumber(5.3);
           number3 = new CustomNumber(0);
       }

    @Test
    public void testAdd() {
        CustomNumber actual = calculation.add(number1, new CustomNumber(5.3));
        CustomNumber expected = new CustomNumber(17.8);
        assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void testDivide() {
        CustomNumber actual = calculation.divide(number1, number3);
        CustomNumber expected = new CustomNumber(Double.POSITIVE_INFINITY);
        assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void testMultiply() {
        CustomNumber actual = calculation.multiply(number1, number3);
        CustomNumber expected = new CustomNumber(0);
        assertEquals(actual, expected, "Test failed");
    }

    @Test
    public void testSubtract() {
        CustomNumber actual = calculation.subtract(number1, number2);
        CustomNumber expected = new CustomNumber(7.2);
        assertEquals(actual, expected,"Test failed");
    }
}