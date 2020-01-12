package ch13;
/*
* 1. 接口，可以理解为特殊的类，里面【全部】都是全局常量划入公共的抽喜爱那个方法所组成
* 2.格式： interface interfaceName{全局常量       抽象方法}
* 3. 接口的实现也必须通过子类，使用关键字 implements, 而且接口是可以多实现的
* 4. 一个子类可以同事继承抽象类和实现接口
* 5. 一个接口不能继承一个抽象类，但是可以通过extends关键字同时继承多个接口，实现接口的多继承
* */

interface Inter1{
    public static final int AGE = 10;   // 全局，公共，静态
    public abstract void tell();

}

interface Inter2{
    public abstract void say();

}

interface Inter3 extends Inter1, Inter2{   // 弥补了java中的单继承的不足
//    public abstract void say();

}

abstract class Abs1{
    public abstract void print();
}

class It extends Abs1 implements Inter1, Inter2{
    public void tell(){  // 要对方法进行实现

    }

    public void say(){   // 要对接口中抽象方法进行 复写

    }

    public void print(){   // 同样要复写抽象方法

    }
}


public class java接口的实现 {
    public static void main(String[] args) {
        It i = new It();
        i.tell();
        i.say();
        i.print();
        System.out.println(Inter1.AGE);
    }
}
