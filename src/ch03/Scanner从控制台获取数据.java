package ch03;

import java.util.Scanner;

public class Scanner从控制台获取数据 {
    // Scanner从控制台获取数据

    public static void main(String[] args){
        /*
        String next()    接收控制台输入的一个字符串
        String nextLine()    接收控制台输入的一个字符串, 回车结束
        String nextInt()    接收控制台输入int类型的数据
        String nextDouble()
        String nexBooleant()


        输入char类型数据:   next.charAt(0);  从控制台获取输入的一个字符
        char String.charAt(int index)
        “abc”.charAt(1);
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        String name = sc.next();
        System.out.println("年龄：");
        int age = sc.nextInt();
        System.out.println("性别：");
        char sex = sc.next().charAt(0);
        System.out.println("身高：");
        double h = sc.nextDouble();
        System.out.println("爱好：");
        String aihao = sc.next();

        System.out.println("大家好，我叫" +name+",年龄"+age + "，性别"+ sex+ "，身高"+h+" m, 爱好是: "+aihao);




    }
}
