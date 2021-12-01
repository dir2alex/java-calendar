import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class combo {
    public static void main(String [] args)
    {
        Calendar c = new GregorianCalendar();
        c.setLenient(false);
        c.set(2021, 0, 1000);
        //c.rollCalendar.DATE, 50);
        System.out.println(c.getTime());
    }
    
}
