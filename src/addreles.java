/**
 * Created by winsion on 2017/1/13.
 */
import com.sun.javafx.binding.StringFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class addreles {

    public int add(int a, int b) {
        return a + b;

    }
}


class arrayType {

    public int[] intiwith(int[] haha) {
        int[] newarray = new int[haha.length];

        for (int i = 0; i < haha.length; i++) {
            newarray[i] = haha[haha.length -1 -i];
        }
        return  newarray;
    }

}


class  dataTime {

    public void currentDate(){
       Date date = new Date();
        date.getTime();

        //格式化日期

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(format.format(date));


        String str = String.format("%tc",date);
//        System.out.printf(str);

        //传入的时间字符串一定要和格式一样
        String input = "1888-10-10 11:35:25";
        System.out.println(input);

        Date t;
        try {
            t = format.parse(input);
            System.out.println(t);
        }catch (ParseException e){
            System.out.println(format);
        }
    }
}