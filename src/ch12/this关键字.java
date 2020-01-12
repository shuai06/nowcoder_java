package ch12;
/*
* 1.表示类中的属性和调用方法
* 2.调用本类的构造方法
* 3.表示当前对象
*
*
* */


class Haha{
    private String name;
    private int age;

    public Haha(String name, int age){
        this();    // 调用无参数的构造方法， 必须放在首行
//        name = name;   // 这样是不行的
//        age = age;
        this.name = name;
        this.age = age;
        System.out.println("有参数的构造方法");


    }

    public Haha(){
        System.out.println("无参数的构造方法!!!");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tell(){
        System.out.println(this.age + this.getName());
    }
    public void telThis(){
        System.out.println(this);
    }
}



public class this关键字 {
    public static void main(String[] args) {
        Haha p = new Haha("zhangsan", 30);
        p.tell();

        System.out.println(p);  // 下面两个输出是一样的
        p.telThis();
    }
}
