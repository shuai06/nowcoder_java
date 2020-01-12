package ch08;

class Person{    // 类名首字母大写
    String name=null;
    int age=0;

    public void tell(){
        System.out.println("姓名："+name+",年龄: "+age);
    }
}


// 面向对象思想
/*
* 封装     对外部不可见
* 继承     扩展类的功能
* 多态     对象的多态性
* */




public class 类的定义 {
    public static void main(String[] args) {

//        Person p = null;    // 声明    开辟了栈内存空间
//        p = new Person();  // 实例化        开辟了堆内存空间
        Person p = new Person();   //  // 声明并实例化
        p.name = "帅帅";
        p.age = 18;
        p.tell();

        // 如果不实例化， 会空指针异常，没有指向的对象了
    }
}













