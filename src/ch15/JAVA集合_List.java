package ch15;

/*
*
* List借口可以存放任意数据，而且在List借口中内容是可以重复
* List接口常用子类： ArrayList,   Vector
* */



import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class JAVA集合_List {
    public static void main(String[] args) {

        // 1.  ArrayList, 内容可以重复
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("888");
        list.add("567");

        list.forEach(s -> System.out.println(s));
        System.out.println("*********");

        list.remove("123");

        list.removeIf(s -> s.equals("888"));

        System.out.println(list);
        System.out.println(list.isEmpty());

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.indexOf("8")); // 8 是否存在，包含是孙银，否则是-1

        //2.  Vector
        List<String> l = new Vector<>();
        l.add("A");
        l.add("B");



    }
}




/*
*
1、添加方法
 boolean add(Object obj)      : 添加一个对象
 boolean addAll(Collection c) : 添加一个集合的对象
2、删除方法
 void clear() 移除所有对象
 boolean remove(Object) 移除一个对象
 boolean removeAll(Collection c) 移除一个集合的对象，只要有一个对象移除了，就返回true
3、判断方法
 boolean contains(Object o) 判断集合是否包含该对象
 boolean containsAll(Collection c) 判断集合中是否包含指定的集合对象，只有包含所有的对象，才返回 true。
 boolean isEmpty() 判断集合是否为空。
4、获取方法
 Iterator<E> iterator() 迭代器
5、长度功能
 int size() 对象个数
6.交集功能
 boolean retainAll(Collection c) 移除此 Collection 中未包含在指定Collection 中的所有对象，简单说就是，集合 1 和集合 2 进行对比，最终结果保存在集合 1 ，返回值表示的是 A是否发生变化。
7. 查找找制定对象是否存在：　indexOf()
*
* *
*
*
* */