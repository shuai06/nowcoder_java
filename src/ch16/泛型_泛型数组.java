package ch16;
/*
*一般搭配泛型方法使用
*
* */


public class 泛型_泛型数组 {
    public static void main(String[] args) {

        String arr[] = {"www","xpshuai","cn"};
        tell(arr);
    }
    public static <T>void tell(T arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}


















