package ch14;

public class StringBuilder用法 {
    public static void main(String[] args) {

        // 可以简单替换StringBuffer, 用在字符串被单个线程使用的时候，速度较快
        // 但是涉及到线程安全方面，建议使用StringBuffer
        StringBuilder sb = new StringBuilder();


//        sb.append()
//        sb.insert()
    }
}
