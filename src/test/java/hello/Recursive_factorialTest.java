package hello;

import org.junit.Assert;
import org.junit.Test;

import static hello.Fibonachi.fib;
import static hello.Recursive_factorial.factorial;
import static org.junit.Assert.*;

public class Recursive_factorialTest {

    @Test
    public void tetsfactorial() {
        int a = 5;
        int expectedResult = 120;
        long result = factorial(5);
        Assert.assertEquals(expectedResult, result);
    }
}