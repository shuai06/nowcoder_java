package ch16;

/*
* 泛型方法中可以定义泛型参数，此时，参数的类型就是传入数据类型
* 格式：　访问权限　<泛型标识>　方法ｎａｍｅ（[泛型标识, 参数ｎａｍｅ]）
* 参考链接：　https://www.cnblogs.com/coprince/p/8603492.html
* */



class Test{
    // 定义一个　泛型方法   <T>T, 第二个Ｔ是返回值类型
    public <T>T tell(T t){
        return t;
    }
}

public class 泛型_泛型方法 {
    public static void main(String[] args) {
    Test t = new Test();
    String str = t.tell("xxx");
    System.out.println(str);

    int i = t.tell(10);

    System.out.println(i);
    }

}
