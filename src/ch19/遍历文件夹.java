package ch19;

import java.io.File;

public class 遍历文件夹 {
    public static void main(String[] args) {

        printFiles(new File("/home/xps/devdata/Study"), 1);
//        printFiles(new File("../"), 2);

    }

    public static void printFiles(File dir, int tab){
        if(dir.isDirectory()){
            File next[] = dir.listFiles();
            for(int i=0; i<next.length; i++){
                for(int j=0;j<tab;j++){
                    System.out.print("|---");
                }
                System.out.println(next[i].getName());
                if(next[i].isDirectory()){  // 如果是文件夹
                    printFiles(next[i], tab+1); // 递归
                }
            }
        }
    }
}
