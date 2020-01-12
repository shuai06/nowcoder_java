package ch12;
/*
* 1. 使用static声明属性： 全局属性
* 2. 使用ststic声明方法：  直接通过类名调用
* 3.注意： 使用static方法的时候，只能访问static声明的属性和方法，而非static声明的属性和方法是不能访问的，【静态方法中不能调用非静态方法和属性】
*
* */

class Chinese{
    String name;
    static String county = "北京";   // static  ,变成共有，  修改一个，下面的全改了
    public Chinese(String name){
        this.name = name;
    }

    public static String getCounty() {
        return county;
    }

    public static void setCounty(String county) {
        Chinese.county = county;
    }

    public void tell(){
        System.out.println(name + ", " + county);
    }
}



public class static关键字 {
    public static void main(String[] args) {
        Chinese c1 = new Chinese("小明");
//        Chinese.county = "上海";  // 修改一个，下面的全改了, 通过类名调用
        Chinese.setCounty("上海");  // 【在对象实例化之前就被调用了】
        c1.tell();
        Chinese c2 = new Chinese("小华");
        c2.tell();
        Chinese c3 = new Chinese("李明");
        c3.tell();
    }
}
