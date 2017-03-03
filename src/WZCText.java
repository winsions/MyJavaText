

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by winsion on 2017/1/12.
 */
public class WZCText {

    public static void main(String[] args) {

//        plus plusa = new plus();
//        plusa.hahah();

        int[] res = Myli(new int[]{1,2,3,4,5});

        System.out.println(Arrays.toString(res));


        arrayType add = new arrayType();
         int[] res2 = add.intiwith(res);
        System.out.println(Arrays.toString(res2));
    }

    public static int[] Myli(int[] array){

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int j = array.length -1 -i;
            result[j] = array[i];
        }
        return result;
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
