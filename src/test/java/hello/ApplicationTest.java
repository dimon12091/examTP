package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void homedata() {
        Calendar c = new GregorianCalendar(2017, 0 , 25);
        Date date = c.getTime();

        String str = "Quartal of "+date+" is: "+Integer.toString(c.get(Calendar.MONTH)/3+1);
        int expectedResult = 1;
        int result = c.get(Calendar.MONTH)/3+1;
        Assert.assertEquals(expectedResult, result);
    }
}