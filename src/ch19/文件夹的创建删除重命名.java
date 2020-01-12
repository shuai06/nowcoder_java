package ch19;


import java.io.File;

public class 文件夹的创建删除重命名 {
    public static void main(String[] args) {

        File folder = new File("my folder");
        File newfolder = new File("new folder");
         // 重命名   可以单独重命名某一级
        if(folder.renameTo(newfolder)){
            System.out.println("rename ok!");
        }

        // 删除  (必须空文件夹)
        if(newfolder.delete()){
            System.out.println("删除new folder 成功");
        }

        if(folder.mkdir()){       // mkdirs(),  创建多级目录 ： new File("/bin/hello/a")
            System.out.println("文件夹create成功");
        }else {
            if(folder.exists()){
                System.out.println("文件夹已经存在了，不用创建");
            }else{
                System.out.println("文件夹create失败");
            }

        }

    }
}
