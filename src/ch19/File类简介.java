package ch19;

import java.io.File;

public class File类简介 {
    public static void main(String[] args) {

        File file = new File("hello.txt");

        // 是否存在
        if(file.exists()){
            //文件
            System.out.println(file.isFile());
            //路径（文件夹）
            System.out.println(file.isDirectory());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());

        }else {
            System.out.println("文件不存在");
        }

    }
}
