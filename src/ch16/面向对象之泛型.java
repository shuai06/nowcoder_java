package ch16;

/**
 *JDK1.5之后新增的　，　解决数据类型的安全性问题　
 * 格式：　访问权限 class 类名称<泛型，　泛型>｛
 * 属性
 * 方法
 * ｝
 *
 *
 * 对象的创建：　类名称<具体类型> 对象名称　＝　new 类名称<具体类型>();
 *
 *
 * */

class Point<T>{   // 并不制定具体类型，　下面需要什么type直接传递即可
    private T x;
    private  T y;

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

}

public class 面向对象之泛型 {
    public static void main(String[] args) {
        Point<String> p = new Point<String>();
//        Point<Integer> p = new Point<Integer>();   // 根据需要传递参数数据类型
        p.setX("经度为: 100");
        p.setX("纬度为: 39");
        System.out.println(p.getX() + p.getY());







//    Point p = new Point();
//    p.setX(10.1f);
//    p.setY(29.5);
//    // 拆箱f箱
//     float px = (Float) p.getX();
//     float py = (Float) p.getY();
//
//     System.out.println("X="+px+"  ,  Y= "+py);
    }
}
