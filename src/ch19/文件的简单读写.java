package ch19;

/*
*
* */


import java.io.*;

public class 文件的简单读写 {
    public static void main(String[] args) throws IOException {

        File f = new File("test.txt");
        if(f.exists()){
            System.err.println("exist");
            // 读取文件
            FileInputStream fis = new FileInputStream(f); // 参数是文件 或者字符串形式的文件路径
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null ){
                System.out.println(line);
            }
            br.close();
            isr.close();
            fis.close();

        }

        // 写入文件  会覆盖
        File nf = new File("new-test.txt");
        FileOutputStream fos = new FileOutputStream(nf);   // 文件不存在，自动创建
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bfd = new BufferedWriter(osw);

        bfd.write("11111111111111\n");
        bfd.write("2222222222222\n");
        bfd.write("3333333333333\n");
        bfd.close();
        osw.close();
        fos.close();

        System.out.println("写入完成！");


        //构造函数中的第二个参数true表示以 【追加形式写文件】
//        FileWriter fw = new FileWriter(filePath, true);
//        fw.write(content);
//        fw.close();





    }
}
