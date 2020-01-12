package ch11;
/*
*
* 体现： 方法的重载和重写，对象的多态性
* 对象的多态性：向上转型：程序自动完成： 父类 父类对象=子类实例
* 向下转型： 强转： 子类 子类对象=（子类）父类实例
*
*
* */

class Multi{
    public void tell1(){
        System.out.println("a---tell1");
    }
    public void tell2(){
        System.out.println("a---tell2");
    }
}


class B extends Multi{
    public void tell1(){
        System.out.println("B---tell1");
    }

    public void tell3(){
        System.out.println("B---tell3");
    }
}

class C1 extends Multi{
    public void tell4(){
        System.out.println("C1 --- tell4");
    }
}



public class 多态 {
    public static void main(String[] args) {
        // 向上转型
//        B b = new B();
//        Multi a = b;
//        a.tell1();  //重写的
//        a.tell2();
//
//        // 向下转型
//        Multi a = new B();   // 实例化的B
//        B b = (B)a;
//        b.tell1()
//        b.tell2();
//        b.tell3();

    say(new B());
    say(new C1());

    }


    public static void say(Multi a){
        a.tell1();
    }



}
