package ch15;

//https://www.cnblogs.com/bkyxnc/p/10460199.html


/*
* 迭代输出接口
* 　方法：
*    hasNext()
*    next()
*    remove()   remove最后一个元素
*
*
*
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JAVA集合_Iterator {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();

        l.add("A");
        l.add("F");
        l.add("D");
        l.add("A");
        l.add("C");
        l.add("B");

        //
        Iterator<String> iter = l.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if("A".equals(str)){
                iter.remove();  // A 被删除了;  迭代输出的同事，不能List.remove删除元素
            }else{
                System.out.println(str);
            }
           
        }

    }
}
