package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class timeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void show() {
        int year = 2017;
        int mounth = 1;
        int day = 27;
        String quartal = time.show(year,mounth,day);
        Calendar c = new GregorianCalendar(year,mounth,day);
        Date date = c.getTime();
        String str = "Quartal of "+date+" is: "+Integer.toString(c.get(Calendar.MONTH)/3+1);
        assertEquals(quartal,str);
    }
}