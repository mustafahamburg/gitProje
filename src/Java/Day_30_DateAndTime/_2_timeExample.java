package Java.Day_30_DateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _2_timeExample {
    public static void main(String[] args) {
        // Google dan kopyalayip yapistirdik...
        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss" );
        Date tarih = new Date ();
        System. out. println(sdf. format(tarih)); // 27/03/2023 19:54:27
    }
}
