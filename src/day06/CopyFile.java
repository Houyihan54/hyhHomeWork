package day06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//每次读一个字符
public class CopyFile {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileReader fr = new FileReader("FAITH.java");
        // 封装目的地
        FileWriter fw = new FileWriter("d:\\Copy.java");

        // 读取数据，每次读一个字符
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        // 释放资源，关闭遵循就近原则，fw最近，先关fw
        fw.close();
        fr.close();
    }
}
