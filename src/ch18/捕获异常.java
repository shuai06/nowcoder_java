package ch18;

class Exc{
    int i=10;
}

public class 捕获异常 {
    public static void main(String[] args) {

//        Exc e = null;
////        e = new Exc();
//        System.out.println(e.i);

        int a = 10;
        int b = 0;
        int tmp = 0;

        try{
            tmp = a/b;

        }catch (Exception e){
            System.out.println("异常：");
            System.out.println( e);
        }finally {
            System.out.println("Ｆｉｎａｌｌｙ");
        }

        System.out.println(tmp);
    }
}
