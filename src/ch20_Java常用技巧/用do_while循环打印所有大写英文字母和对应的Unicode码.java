package ch20_Java常用技巧;

public class 用do_while循环打印所有大写英文字母和对应的Unicode码 {
    public static void main(String[] args) {
        int i = 97; // 'a'
        do {
            System.out.println((char)i +":"+i);
            i++;
        }while (i<=97+25);



    // F2
    System.out.println("==========F2==========");
    char c = 'a';
    do {
        System.out.println(c +" : "+ (int)c);
        c++;
    }while (c <= 'z');





    }

}
