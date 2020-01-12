package ch16;
/*
* JDK 1.5 之后，　不仅仅可以声明泛型类，　也可以声明泛型接口，声明泛型接口和声明泛型类的语法类似，也是在接口名称后门加上<T>
* */


interface Demo<T>{

    public void say();
}

class Gin<T> implements Demo<T>{
    private String info;
    public Gin(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void say() {

    }
}


public class 泛型_泛型接口 {
    public static void main(String[] args) {

        Gin<String> g = new Gin<String>("哈哈哈");

        System.out.println(g.getInfo());

    }
}
