package ch20_Java常用技巧;

public class 用while循环打印所有大写英文字母和对应的Unicode码 {
    public static void main(String[] args) {
        int i = 65; // A
        while (i<=65+25){
            System.out.println((char)i + " : "+ i);
            i++;
        }



        // F2
        System.out.println("*****F2*******");
        char c = 'A';
        while (c<='Z'){
            System.out.println(c + ":" +(int)c);
            c++;
        }
    }
}
