package ch03;

public class 数据类型 {
    /*1.
      字节型    1B
      short  2B
      int  4B
      long 8B
      float  8
      double 8
      char 1
      boolean 1 / 4


      2. 栈空间
        存储效率高, 存储空间较小, JVM将基本数据存在栈空间

      3.堆空间
        存取数据效率最低,存放位置随机分配,存放大的数据

      4.变量:
        首字母 : 英文字母,$,下划线, 驼峰命名法

      5. 变量保存多种类型的数据:
        float h = 1.99f;

      6. 变量的作用域

      7. 基本数据类型的包装类: Byte->byte,  一般都是首字母大写    test
         最大值最小值,转换类型

     */

    String name = "外面的呵呵";
    public static void main(String [] args){
        String name="呵呵";
        System.out.println(name);


        test();

    }

    //
    public static void test(){
//        Long.toHexString(); //
        System.out.println(Byte.MIN_VALUE  +"~"+ Integer.MAX_VALUE);
        System.out.println(Byte.parseByte("108")+10); // 118

    }
}
