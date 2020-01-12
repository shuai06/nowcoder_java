package ch15;


/*
* 键值对
*
* 常用子类：
* 　HashMap　：　无序存放，key不允许重复
*   Hashtable: 无序存放，key不允许重复
*
*
* */


import java.util.*;

public class JAVA集合_Map {
    public static void main(String[] args) {
        // 一个泛型，　里面两种类型   <key, val>
        Map<String, String> map = new HashMap<String, String>();

        map.put("k1", "val1");
        map.put("k2", "val2");
        map.put("k3", "val3");
        map.put("k4", "val4");
        map.put("k5", "va54");

//        String str = map.get("key1");   // 通过键来找到值

        if(map.containsKey("key2")){       // 判断key是否存在
            System.out.println("key2存在");
        }else {
            System.out.println("key2 bu 存在");
        }

        if(map.containsValue("val2")){
            System.out.println("val2存在");
        }else {
            System.out.println("val2 bu 存在");
        }

        //
//        map.keySet();  // 打印所有的ｋｅｙｓ
        Set<String> s = map.keySet();
        Iterator<String> i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // map.values()    打印所有的values

        Collection<String> c = map.values();
        Iterator<String> ii = c.iterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }


        // map.get()    根据key取出value   参考：　https://www.jb51.net/article/169256.htm

        //map.keySet() 先获取map对象的所有key值，再循环遍历获取各个key对应的value;
        System.out.print("通过 map.keySet() 得到key，然后获取value\n");
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+" "+value);
        }





    }
}





















