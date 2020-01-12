package ch02;

public class 定义带返回值的方法 {
    public static void main(String [] args){
            double resu = pround(9.1258, 2);   // 保留小数的小数点后index位
            System.out.println(resu);
    }

    public static  double pround(double val, int index){
            double pow10 = Math.pow(10, index);
            double result = val * pow10;
            result = Math.round(result);
            result = result * 1.0 /pow10;

            return result;
    }
}
