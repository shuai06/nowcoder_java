package ch16;

class Info<T>{
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
    @Override
    public String toString(){
        return this.getKey().toString();
    }


}


public class 泛型_通配符 {
    public static void main(String[] args) {
        Info<String> i = new Info<String>();
        i.setKey("哈哈哈");
        tell(i);
    }

    // 通配符：　不管什么类型都可以使用   ?　问号
    public static void tell(Info<?> i){
        System.out.println(i);
    }
}
