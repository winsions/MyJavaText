
//package 方法.流.类.包.多肽.集成;
import 方法.流.类.包.多肽.集成.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by winsion on 2017/1/12.
 */
public class WZCText {

    public static void main(String[] args) throws IOException{
//        plus plusa = new plus();
//        plusa.hahah();
        //数组
//        int[] res = Myli(new int[]{1,2,3,4,5});
//
//        System.out.println(Arrays.toString(res));
//q
//        arrayType add = new arrayType();
//         int[] res2 = add.intiwith(res);
//        System.out.println(Arrays.toString(res2));
//        //时间
//        getCurrentDate();
        //流读取后天内容
//        BRread read = new BRread();
//        read.ReadFrom();
//        read.sysout();
//        read.creatNewfile();
        //抽象类

        Salary a = new Salary("WZC","珠海",44,33.33);
        Employee e = new Salary("小萝莉","山东",20,1.56);
        a.checkmail();
        e.checkmail();
        a.computePay();

    }

    //数组
    public static int[] Myli(int[] array){

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int j = array.length -1 -i;
            result[j] = array[i];
        }
        return result;
    }
    //时间
    public static void  getCurrentDate(){

        dataTime date = new dataTime();
        date.currentDate();

        SleepDemo sleep = new SleepDemo();
        sleep.seleep();

        //时间  Canlender
        Canlender cander = new Canlender();
        cander.canlenders();

    }
}




// 基本类型
class demo {


    private int a;
    private int b;

    public demo(int name) {

        this.a = name;

    }
//    public void setA(int a){
//
//        this.a = a;
//    };

    public void setB(int b) {

        this.b = b;
    }

    public int sum() {

        System.out.println("hahh");

        return a + b;
    }

}

//引用类型

class person {

    public void main() {
        System.out.println("shiwoma");
    }
}

class persongdemi {

    public void re(person s) {

        s.main();
    }
}

class  plus {

    public void hahah(){
        String[] myList = new String[10];
        for (int i = 0; i < 9; i++) {
           myList[i] = "fjasfj";
        }

        double[] mylists = {1.1,222.3,22.3,4.4};
        double total = 0;
        for (int i = 0; i < mylists.length; i++) {
            total += mylists[i];
        }
        System.out.println(total);

        for (double text :
                mylists) {
            total += text;
        }
        System.out.println(total);

    }
}
