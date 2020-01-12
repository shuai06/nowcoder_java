package ch15;


/*
* 1. Set接口不能加入重复元素，但是可以排序
* ２．常用子类： 散列存放：HashSet, 有序存放：TreeSet
*
* */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JAVA集合_Set {
    public static void main(String[] args) {
//        Set<String> s = new HashSet<String>();

        Set<String> s = new TreeSet<>();

        s.add("a");
        s.add("a");
        s.add("b");
        s.add("u");
        s.add("z");
        s.add("e");

        System.out.println(s);

    }
}
