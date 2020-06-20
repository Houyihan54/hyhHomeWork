package day06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//每次读一个字符数组
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileReader fr = new FileReader("FileWriterDemo.java");
        // 封装目的地
        FileWriter fw = new FileWriter("d:\\Copy.java");

        //每次读一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {  // <span style="font-family: Arial;">fr.read(chs))表示每次读一个字符数组</span>

            //写入数据.
            fw.write(chs,0,len); // len是读到数据的实际长度
        }

        // 释放资源，关闭遵循就近原则，fw最近，先关fw
        fw.close();
        fr.close();
    }
}
