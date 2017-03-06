package 方法.流.类.包.多肽.集成;

/**
 * Created by winsion on 2017/3/6.
 */
import java.io.*;
import java.io.IOException;
public class BRread {

    public static void  ReadFrom() throws IOException{
        char c;
        BufferedReader readhaha = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("输入字符, 按下 'q' 键退出。");
        //读取字符

        do {
            c = (char) readhaha.read() ;
            System.out.println(c);
        } while (c != 'q');
    }


    public  void sysout()throws IOException{

        File f = new File("/Users/winsion/Desktop/BaiduMapModule.m");
        InputStream fs = new FileInputStream(f);
        int i = fs.available();
        System.out.println(i);
//        for (int j = 0; j < i; j++) {
//            System.out.println((char)fs.read()+ " ");
//        }

    }

    public static void creatNewfile(){

        String dirname = "/Users/winsion/Desktop/haha.text";
        File f1 = new File(dirname);
        f1.mkdirs();
//        String dirname = "/tmp";
//        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println( "目录 " + dirname);
            String s[] = f1.list();
            for (int i=0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
    }

}