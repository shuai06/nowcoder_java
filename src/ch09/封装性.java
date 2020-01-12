package ch09;

class Person{
    private int age;       // 【private外界不能访问， 要想访问 -> 实现该属性的set和get方法】
    private String name;

    //
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<150){  // age符合的时候才设置
            this.age = age;     // 前面的this.age 是类的age， 后面age是参数
        }

    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void tell(){
        System.out.println("姓名："+name+",年龄: "+age);

    }

}



public class 封装性 {
    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(20);
        p.setName("小小");
//        p.age = 20;
//        p.name = "xxx";
        p.tell();
    }
}
