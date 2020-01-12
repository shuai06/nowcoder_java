package ch07;

public class 数组的使用 {
    public static void main(String [] args){
        int score[] = {11,44,55,88,65};
        int max, min;
        max = min = score[0];
        for (int i = 0; i<score.length; i++){
            if (score[i] > max){
                max = score[i];
            }
            if (score[i]<min){
                min = score[i];
            }
        }

        System.out.println("max:   "+max);
        System.out.println("min:  "+min);

    }
}
