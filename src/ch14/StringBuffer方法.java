package ch14;



public class StringBuffer方法 {
    public static void main(String[] args) {
        // StringBuffer  可以更改的, 必须通过实例化来

        StringBuffer sb = new StringBuffer();
        sb.append("hahaha");
        tell(sb);

        System.out.println(sb.toString());   // 已经更改了

        // 【常用方法】：
        sb.append("sss");
        sb.insert(1, "aaa");
        sb.replace(1, 3,"love");
        sb.indexOf("s");   //   判断字符串中是否存在某字符，返回索引，不存在就是-1

        // 【应用】：
        /*
        *效率比较高
        *
        * */




    }

    public static void tell(StringBuffer s){
        s.append("嗯嗯嗯");
    }
}
