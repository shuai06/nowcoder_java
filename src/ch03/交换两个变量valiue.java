package ch03;

public class 交换两个变量valiue {
    public static void main(String [] args){
        // f1 第三个变量
        // f2
        int a =2;
        int b =5;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+","+b);
    }
}
