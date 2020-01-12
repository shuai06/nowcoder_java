package ch19;

import java.io.File;

public class 文件属性的设置 {
    public static void main(String[] args) {

        File f = new File("test.txt");
        f.setReadOnly();  // 文件只可读
        f.setWritable(false);  // 不可写
        f.setWritable(true); // 可写
        f.setReadable(true);  //可读
        f.setReadable(false); // 不可读

    }
}
