package ch16;


// 设置多个泛型，　直接在<>中添加多个泛型就可以了

class Gen<K, T>{
    private K key;
    private T take;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getTake() {
        return take;
    }

    public void setTake(T take) {
        this.take = take;
    }
}



public class 泛型_制定多个泛型 {
    public static void main(String[] args) {

    Gen<String, Integer> g = new Gen<String, Integer>();
    g.setTake(10);
    g.setKey("哈哈哈");

    System.out.println(g.getKey() +",  "+ g.getTake());

    

    }
}
