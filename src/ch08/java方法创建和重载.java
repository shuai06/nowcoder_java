package ch08;

public class java方法创建和重载 {
    public static void main(String[] args) {
        tell(1,2,3);
        tell(1,2);

    }


    public String testFunc(int i){
        System.out.println(i);
        return "哈哈";
    }

    // 方法重载：【 name相同， 参数个数或者类型不同来实现不同功能】
    public static void tell(int i, int j){
        System.out.println(i+j);
        System.out.println("方法1");
    }

    public static String tell(int i, int j, int n){
        System.out.println(i+j+n);
        System.out.println("方法2");

        return "重载方法2";

    }


}
