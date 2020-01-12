package ch13;

/*
* 包含一个抽象方法的类就是抽象类
*
* 抽象类被子类继承，子类（如果不是抽象类）必须重写抽象类中所有抽象方法
*
* 抽象类不能直接实例化，要通过其子类进行实例化
* */

abstract class Demo{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void tell(){

    }

    // 抽象方法
    public abstract void say();
}


class AbsDemp extends Demo{

    // 重写抽象方法并且实现
    public void say(){
        System.out.println(this.getAge());
    }
}


public class 抽象类 {
    public static void main(String[] args) {
//        Demo d = new Demo();
        // 实例化子类
        AbsDemp a = new AbsDemp();
        a.setAge(20);
        a.say();

    }
}
