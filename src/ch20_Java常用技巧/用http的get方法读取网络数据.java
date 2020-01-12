package ch20_Java常用技巧;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class 用http的get方法读取网络数据 {
    public static void main(String[] args) {

        new ReanByGet().start();


    }
    static class ReanByGet extends Thread{
        @Override
        public void run() {
           String u = "http://fanyi.youdao.com/openapi.do?keyfrom=<keyfrom>&key=<key>" +
                    "&type=data&doctype=<doctype>xml&version=1.1&q=要翻译的文本";
            try {
                URL url = new URL(u);
                URLConnection conn = url.openConnection();  // 打开链接
                InputStream is = conn.getInputStream();  // 获取输入liu
                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(isr);

                String line;
                StringBuilder buinder = new StringBuilder();
                while ((line=br.readLine()) != null){
                    buinder.append(line);
                }
                br.close();
                isr.close();
                is.close();

                System.out.println(buinder.toString());

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}








































