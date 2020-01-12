package ch11;

abstract class Person9{
    private int age;
    private String name;

    public Person9(int age, String name){
        this.age = age;
        this.name = name;
    }

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

    // 抽象方法
    public  abstract void want();


}


class Student9 extends Person9{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student9(int age, String name, int score){
        super(age, name);
        this.score = score;
    }


    @Override
    public void want() {
        System.out.println(getName()+ getAge()+ getScore());

    }
}



class Worker9 extends Person9{
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Worker9(int age, String name, int money){
        super(age, name);
        this.money = money;
    }

    @Override
    public void want() {
        System.out.println(getName()+ getAge()+ getMoney());

    }

}

public class 抽象类 {
    public static void main(String[] args) {
    Student9 s = new Student9(10, "小明", 100);
    s.want();
    Worker9 w= new Worker9(35,"大名", 10000);
    w.want();

    }
}
