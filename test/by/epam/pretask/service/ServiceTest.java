package by.epam.pretask.service;

import by.epam.pretask.entity.CustomNumber;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ServiceTest {

    @Test
    public void testAdd() {
        double actual = Service.add(new CustomNumber(12.5), new CustomNumber(5.3));
        double expected = 17.8;
        assertEquals(actual, expected, 0.001, "Test failed");
    }
    @Test
    public void testDivide() {
        double actual = Service.divide(new CustomNumber(12.5), new CustomNumber(0));
        double expected = Double.POSITIVE_INFINITY;
        assertEquals(actual, expected, 0.001, "Test failed");
    }
    @Test
    public void testMultiply() {
        double actual = Service.multiply(new CustomNumber(12.5), new CustomNumber(0));
        double expected = 0;
        assertEquals(actual, expected, 0.001, "Test failed");
    }
    @Test
    public void testSubtract() {
        double actual = Service.subtract(new CustomNumber(12.5), new CustomNumber(5.3));
        double expected = 7.2;
        assertEquals(actual, expected, 0.001, "Test failed");
    }
}