package ch03;

public class 数据转换 {
    public static void main(String [] args){
        smallToLarge();
        largeToSmall();
        intTochar();

    }


    // 小类型向大类型转换
    /*
    JVM自动负责，隐式转换
    byte -> short -> int -> long -> float -> double
    int和char的数据某些情况下可以自动转换
    整数转为浮点数， 可能会有损精度
     */
    public static void smallToLarge(){
        int i = -2;
        int l = i;
        System.out.println(i + " *** " + Integer.toBinaryString(i));
        System.out.println(l + " *** " + Long.toBinaryString(l));


        // int 转float
        // 丢失精度
        int j =0x1000001;
        float f = j;
        System.out.println(Integer.toBinaryString(j) +":"+j);
        System.out.println(Integer.toBinaryString((int)f) +":"+f);



    }

    // 大类型向小类型转换  (即 强制转换，注意边界数风险)
    public static void largeToSmall(){
        // 小心: 源数据的数据位变为目标数据的符号位
        int i = 129;
        byte b = (byte)i;   // byte最大值为127

        System.out.println(i);   // 129
        System.out.println(b);  // -127
    }

    // int和char的数据某些情况下可以自动转换
    public static void intTochar(){
        char c = 65;
        int i = 'B';
        System.out.println(c+ "," + i);
    }

}












