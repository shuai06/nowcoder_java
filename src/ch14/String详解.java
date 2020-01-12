package ch14;

public class String详解 {
    public static void main(String[] args) {
        // 实例化String对象
        String s = "hello";
        String ss = new String("hello");

        System.out.println(s);
        System.out.println(ss);

        // Stringn内容比较可以用 equals
        System.out.println(s == ss);  // 比较的是地址，false
        System.out.println(s.equals(ss));  // 比较的是内容， true


        // String 内容不可更改
        ss += " World";
        System.out.println(ss);  // 看似更改，实则没改。改变的是堆内存地址的指向



    }
}
