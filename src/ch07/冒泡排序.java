package ch07;

public class 冒泡排序 {
    public static void main(String[] args) {
        int score[] = {12,35,50,60,88,100};

        for (int i=0; i<score.length-1; i++){
            for (int j=i+1; j<score.length; j++){
                if(score[i]< score[j]){
                    int tmp = score[i];
                    score[i] = score[j];
                    score[j] = tmp;
                }
            }
            // 辅助理解
            System.out.println("第 "+(i+1)+" 排序:");
            for (int j=0; j<score.length; j++){
                System.out.print(score[j] +"  ");
            }
            System.out.println("");
        }

        //  print
        System.out.println("从大到小： ");
        for (int i=0; i<score.length; i++){
            System.out.println(score[i]);
        }


    }
}
