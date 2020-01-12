package ch05;

import java.util.Scanner;

public class if语句 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数：");
        int score = sc.nextInt();
//        if(score >80){
//            System.out.println("成绩优秀：" +score);
//        }else if(score >= 60){
//            System.out.println("成绩及格：" +score);
//        }else if(score <60 && score>=0){
//            System.out.println("成绩不及格：" +score);
//        }else {
//            System.out.println("输入正数！！！");
//        }
        int score10 = score / 10;
        switch (score10){
            case 10:
            case 9:
            case 8:
                System.out.println("成绩优秀：" +score);
                break;
            case 7:
            case 6:
                System.out.println("成绩及格：" +score);
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("成绩不及格：" +score);
                break;
            default:
                System.out.println("输入正确的分数！！！");
        }


//        int i=1, j =2, k = 3;
//        int maxVal = i;
//        if(maxVal<j){
//            maxVal = j;
//        }
//        if(maxVal<k){
//            maxVal = k;
//        }
//        System.out.println("The max value is : "+ maxVal);
//


    }
}
