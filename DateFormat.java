package Java50;

import java.text.SimpleDateFormat;
import java.util.Date;

//Print a date in specific format in Java
public class DateFormat {
    public static void main(String[] args) {
        String pattern = "dd-MM-YYYY";
        //SimpleDateFormat sdf = new SimpleDateFormat(); //26/12/22, 12:10 pm
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //26/12/22

        String date = sdf.format(new Date());
        System.out.println(date);

    }
}
