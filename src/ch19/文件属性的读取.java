package ch19;

import java.io.File;

public class 文件属性的读取 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());  // 相对路径
        System.out.println(f.getParent());  // 父级路径  null
        System.out.println(new File(f.getAbsolutePath()).getParent());  //成功获取： /home/xxx/Study/nowcoder_study
        System.out.println((float) f.length()/1000 +"KB");
        System.out.println(f.isHidden());  //是否隐藏
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory()); // 是否是文件夹

    }
}
