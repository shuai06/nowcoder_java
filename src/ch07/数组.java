package ch07;

public class 数组 {
    public static void main(String [] args){
        // 声明  type arrName[];     type [] arrName;
        int arr1 [] = null;
        int [] arr2;

        // 内存空间的分配  new    【动态初始化】
        arr1 = new int[5];  // 开辟了5个大小 (实例化)

        //赋值
        for(int i=0; i<arr1.length; i++){
            arr1[i] = i*2+1;
        }

        // 访问取值
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);  // 下标

        }

        System.out.println("数组的静态初始化");
        // 【数组的静态初始化】
        int score[] = {6,2,5,7,9,8};
        for(int i=0; i<score.length; i++){
            System.out.println(score[i]);  // 下标

        }



    }
}
