package ch10;

// extends

class Person{
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
class Student extends Person{
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




public class 继承 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("小夏");
        s.setAge(18);
        s.setScore(99.9);
        s.say();
    }
}
