package ch10;
// 重写： 子类定义了和父类同名的方法：  【方法name相同，返回值类型相同，参数也相同】
// 要想调用父类的，可以用super.say()这样
// 【重写限制】： 被子类重写的方法不能拥有比父类方法更加严格的访问权限： private < default (包内可以访问) < public (整个工程号都可以访问)

// super(),  强行调用父类方法的执行，
// super 不一定在重写中使用，也可以表示那些方法从父类中继承而来的

class Person5{
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

    public void say(){
        System.out.println("我啥都不说");
    }

}

// 继承父类
class Student5 extends Person5{
    private double score;

    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    public void say(){
        super.say();
        System.out.println("我重写了，   年龄："+getAge()+" 姓名: "+getName() +"  成绩:"+getScore());
    }


}




public class 重写与super {
    public static void main(String[] args) {
        Student5 s5 = new Student5();
        s5.setScore(80);
        s5.setAge(18);
        s5.setName("小小");
        s5.say();
    }
}
