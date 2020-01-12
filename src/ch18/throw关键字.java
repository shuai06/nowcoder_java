package ch18;

/*
* 定义一个方法的时候，可以使用throw关键字声明，使用此throws声明的方法表示此方法不处理异常，抛给方法的调用知道处理
*
* throw　直接抛出一个实例化对象异常, 抛出的时候直接抛出异常类的实例化对象即可
* */



public class throw关键字 {
    public static void main(String[] args) throws ArithmeticException {
//        tell(10,0);//  可以在这里进行try catch 处理
        //
        try{
            throw new Exception("实例化异常对象～～～");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void tell(int i, int j) throws ArithmeticException{
        int temp = 0;
        temp = i/j;
        System.out.println(temp);
    }

}








































