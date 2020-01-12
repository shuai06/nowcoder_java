package ch20_Java常用技巧;

// apache 的bao
// http://hc.apache.org/downloads.cgi


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

public class 用HttpClient进行Get方式通信 {
    public static void main(String[] args) {

        new Get().start();  // 启动主线程

    }
}


class Get extends Thread{
    HttpClient client = HttpClients.createDefault();

    @Override
    public void run() {
        HttpGet get = new HttpGet("http://www.baidu.com");
        try {

            HttpResponse response = client.execute(get);
            HttpEntity entity = response.getEntity(); //
            String str = EntityUtils.toString(entity, "UTF-8");
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
