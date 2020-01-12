package ch14;

public class String常用方法 {
    public static void main(String[] args) {
        String s = "  hello  ";

        System.out.println(s.length());
        char data[] = s.toCharArray();   // 字符串转换为数组
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+"  ");
        }
        System.out.println("-----------");
        System.out.print(s.charAt(4));  // 从str中提取指定索引的字符

        byte bytes[] = s.getBytes(); // 字符串与byte数组转换
        for (int i=0;i<data.length;i++){
            System.out.println(new String(bytes)+ "\t");
        }

        System.out.println(s.indexOf("l"));  // 判断字符串中是否存在某字符，返回索引，不存在就是-1

        System.out.println(s.trim());   // 去掉空格

        s.substring(0, 3);  // 从字符串中取出子字符串
        s.toLowerCase();  // 大小写
        s.toUpperCase();
        s.replace("hel", "hhhhhh");





    }
}
