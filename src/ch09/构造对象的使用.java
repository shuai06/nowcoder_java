package ch09;


class Test{
    int age;
    String name;
    // 构造方法: 【和类名相同， 并且没有返回值】， 不需要进行调用,【 new之后就自动执行】
    // 【功能】： 可以传递参数， 为属性初始化。  如果自己不创造构造方法，系统会自动创建一个无参数的构造方法
    public Test(int a, String n){
        System.out.println("hello， 构造方法！！！ ");
        age = a;
        name = n;
        System.out.println(name+", "+age);
    }

    // 第二个构造方法   ---> 参数类型和个数不同：【重载了】
    public Test(int a){
        age = a;
    }
}


public class 构造对象的使用 {
    public static void main(String[] args) {
        Test t = new Test(20,"呵呵");
    }
}
