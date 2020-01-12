package ch08;

public class java方法的递归调用 {
    public static void main(String[] args) {
        System.out.println(addNum(100));
    }

    // 递归调用： 自己调用自己
    // 从1+100，直到1
    public static int addNum(int num){
        if (num==1){
            return 1;
        }else{
            return num + addNum(num-1);
        }
    }
}
