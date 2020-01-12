package ch18;
/*
* 直接继承　Exception就可以完成自定义异常类
* */


class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}


public class 自定义异常 {
    public static void main(String[] args) {
        try{
            throw new MyException("自定义异常");
        }catch (MyException e){
            System.out.println(e);
        }
    }
}
