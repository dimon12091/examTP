package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static hello.Calculator.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testsum() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = sum(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testsubstract() {
        int a = 15;
        int b = 20;
        int expectedResult = -5;
        long result = substract(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testdivide() {
        int a = 10;
        int b = 2;
        int expectedResult = 5;
        long result = divide(a,b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testmultiplication() {
        int a = 10;
        int b = 20;
        int expectedResult = 200;
        long result = multiplication(a,b);
        Assert.assertEquals(expectedResult, result);
    }
}