package 方法.流.类.包.多肽.集成;

/**
 * Created by winsion on 2017/3/3.
 */

import java.util.*;
public class SleepDemo {

    public  static void seleep(){

        try {

            long start = System.currentTimeMillis();
            System.out.println(start);
            System.out.println(new Date() + "/n");

            Thread.sleep(1000 *2);

            System.out.println(new Date() + "/n");
            long end = System.currentTimeMillis();
            long dff = end - start;
            System.out.println(dff);
        } catch (Exception e){

            System.out.println("got a Exception");

        }
    }


}
