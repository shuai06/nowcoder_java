package ch18;
/*
* 【常见异常：】
* 数组越界： ArrayIndexOutOfBoundsException
* 数字格式化异常： NumberFormatException
* 算数异常：  ArithmeticException
* 空指针异常： NullPointerException
* 。。。。。。
* */


class Exc2{
    int a= 10;
    int b= 10;
}

public class 常见异常 {
    public static void main(String[] args) {
        Exc2 e = null;
        e = new Exc2();
        int tmp = 0;

        try{
            tmp = e.a/e.b;
            System.out.println(tmp);

        }catch (NullPointerException e1){
            System.out.println("空指针异常：");
            System.out.println( e1);
        }
        catch (ArithmeticException e2){
            System.out.println("算数异常：");
            System.out.println( e2);
        }
        catch (Exception e3){
            System.out.println("异常：");
            System.out.println( e3);
        }finally {
            System.out.println("程序退出!");
        }
    }
}
