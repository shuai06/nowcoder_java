package ch19;

import java.io.File;
import java.io.IOException;

public class 文件的创建删除重命名 {
    public static void main(String[] args) {

        File file = new File("hello.txt");   // 位置在项目的根目录

        // 是否存在
        if(file.exists()){
            //文件
            System.out.println(file.isFile());
            //路径（文件夹）
            System.out.println(file.isDirectory());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());

            file.delete();
            System.out.println("文件之前存在，现在删除成功！");

            File nameto = new File("New hello.txt");
            file.renameTo(nameto);   // 文件重命名  （跨目录，必须在同一个分区，否则需要拷贝）


        }else {
            System.out.println("文件不存在");
            try{
                file.createNewFile();
                System.out.println("文件现在创建！");
            }catch (IOException e){
                System.out.println("文件无法创建");
            }
        }

    }
}
