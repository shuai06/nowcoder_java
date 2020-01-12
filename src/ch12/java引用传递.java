package ch12;

import java.sql.Ref;

class Ref1{
    int tmp = 10;
}

class Ref2{
    String temp = "xxx";
}

public class java引用传递 {
    public static void main(String[] args) {
        Ref1 r1 = new Ref1();
        r1.tmp = 20;
        System.out.println(r1.tmp);
        tell(r1);
        System.out.println(r1.tmp);


        String str1 = "hello";  // String不可变
        System.out.println(str1);
        tell(str1);
        System.out.println(str1);

        Ref2 r2 = new Ref2();
        r2.temp = "yyy";
        System.out.println(r2.temp);  // 改变了

        tell3(r2);
        System.out.println(r2.temp);   // 又改了



    }

    public static void tell(Ref1 r2){
        r2.tmp = 30;
    }

    public static void tell(String str2){
        str2 = "修改！";
    }

    public static void tell3(Ref2 r2){
       r2.temp = "zzz";
    }


}
