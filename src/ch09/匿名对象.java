package ch09;

class Student{
    public void tell(){
        System.out.println("hello ");
    }
}

public class 匿名对象  {
    public static void main(String[] args) {

        new Student().tell();   // 匿名，只使用一次

    }
}
