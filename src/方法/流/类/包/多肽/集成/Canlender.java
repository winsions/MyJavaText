package 方法.流.类.包.多肽.集成;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by winsion on 2017/3/3.
 */
public class Canlender {

    public static void canlenders(){

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);

        c1.set(2019,11,20);
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
    }


}