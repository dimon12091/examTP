package hello;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class time {
    int year;
    int mounth;
    int day;
    public static String show(int year,int mounth,int day){
        Calendar c = new GregorianCalendar(year,mounth,day);
        Date date = c.getTime();

        String str = "Quartal of "+date+" is: "+Integer.toString(c.get(Calendar.MONTH)/3+1);
        return str;
    }

}
