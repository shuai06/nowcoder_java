package ch02;

import java.util.Scanner;

public class 定义有参方法 {

    static String name;
    static char gender;
    static short age;
    static float height;
    static String type;


    public static void main(String [] args){
        input();
        input();
    }

    // define a function not the parameter
    static  void input(){
        Scanner scanner = new Scanner(System.in); // 键盘输入
        System.out.println("name: ");
        name = scanner.next();
        System.out.println("gender: ");
        gender = scanner.next().charAt(0);
        System.out.println("age: ");
        age = scanner.nextShort();
        System.out.println("height: ");
        height = scanner.nextFloat();
        System.out.println("性格: ");
        type = scanner.next();

        output(name, gender, age, height, type);
    }

    // another
    static  void output(String name, char gender, short age, float height, String type){
        System.out.print("hello. my name is  " + name);
        System.out.print(", now age is " + age);
        System.out.print(", and gender is " + gender);
        System.out.print(", height is" +height);
        System.out.println(", 性格:  " + type);
    }













}
