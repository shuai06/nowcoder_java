package ch10;
/*
* 1. Java只允许单继承,  但是可以多层继承
* 2. 子类不能直接访问父类的私有成员,   可以通过get() set() 方法来访问
*
*
* */

class Person2{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}

// 继承父类
class Student2 extends Person2{
    private double score;
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    public void say(){
        System.out.println("年龄："+getAge()+"姓名: "+getName() +"  成绩:"+getScore());
    }


}


class Student3 extends Student2{

}


public class 继承的限制 {
    public static void main(String[] args) {

    }
}
