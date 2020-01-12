package ch06;

public class while循环 {
    public static void main(String [] args){
        int a = 65;
        char c = 'A';

        while (a<=65+25){
            System.out.println(c +" : " + a);
            a++;
            c++;
        }


        // do ... while
        int f = 1;
        do{
            System.out.println("上课迟到, 俯卧撑第： " +f+ "次！");
            f++;
        }while (f<=20);
    }
}
