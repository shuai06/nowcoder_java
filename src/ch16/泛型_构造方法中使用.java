package ch16;



class Con<T>{
    private T val;

    public Con(T val){  // 构造方法中使用泛型
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

}

public class 泛型_构造方法中使用 {
    public static void main(String[] args) {
        Con<String> c = new Con<String>("哈哈哈哈");
        System.out.println(c.getVal());
    }
}
