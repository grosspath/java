
package calendarpractice;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarPractice {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
    
}
