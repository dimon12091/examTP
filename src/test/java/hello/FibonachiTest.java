package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static hello.Fibonachi.fib;
import static org.junit.Assert.*;

public class FibonachiTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testfib() {
        int a = 10;
        int expectedResult = 55;
        long result = fib(10);
        Assert.assertEquals(expectedResult, result);
    }
}