package ch13;
/*
* 1.final : 完结器
* 2. final能声明类，方法和属性：  使用final声明的类不能被继承，使用final声明的方法不能被重写，使用final声明的变量变成常量（不可被修改）
* */

final class P {

}

class PPP{
    final public void tell(){

    }
}

class SSS extends PPP{
//    public void tell(){   // 报错

//    }
}


//class S extends P{  // 报错了

//}


// 【一个文件中只能存在一个 public class】

public class final关键字 {
    public static void main(String[] args) {
    final String NAME = "xxx";
//    NAME = "yyy";    // 不能修改
    }
}
