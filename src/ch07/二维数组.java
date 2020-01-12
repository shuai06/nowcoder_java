package ch07;

public class 二维数组 {
    public static void main(String[] args) {
//        int arr1[][];
//        arr1 = new int[3][5];

        int arr2[][] = new int[6][9];

        // 赋值  / 【静态初始化】
        int arr1[][] = {{1,2,3,4,0},{5,4,7,8,9},{1,5,7,8,99}};


        // 输出
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+ "  ");
            }
            System.out.println("");
        }

    }
}
