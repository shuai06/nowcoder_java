package ch10;
// 1.在子类对象实例化之前，必须先调用父类中的构造方法，再调用 先调用子类中的构造方法

class Fu{
    private int age;

    // 构造方法
    public Fu(){
        System.out.println("Fu");
    }
}


class Zi extends Fu{
    public Zi(){
        System.out.println("Zi");
    }
}


public class 子类对象实例化过程 {
    public static void main(String[] args) {
        Zi z = new Zi();

    }
}
