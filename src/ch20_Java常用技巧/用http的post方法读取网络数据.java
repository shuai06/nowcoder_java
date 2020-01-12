package ch20_Java常用技巧;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class ReanByPost extends Thread{
    @Override
    public void run() {
        String u = "http://fanyi.youdao.com/openapi.do";
        try {
            URL url = new URL(u);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();  // qiangzhi转换
            conn.addRequestProperty("encoding", "UTF-8");   // 设置参数
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            OutputStream os = conn.getOutputStream();   // output
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter wr = new BufferedWriter(osw);

            wr.write("keyfrom=<keyfrom>&key=<key>&type=data&doctype=<doctype>xml&version=1.1&q=要翻译的文本");
            wr.flush();

            InputStream is = conn.getInputStream();   // input
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            StringBuilder build = new StringBuilder();
            while ((line=br.readLine()) != null){
                    build.append(line);
            }
            wr.close();
            osw.close();
            os.close();
            br.close();
            isr.close();
            is.close();

            System.out.println(build.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class 用http的post方法读取网络数据 {
    public static void main(String[] args) {

        new ReanByPost().start();

    }
}
