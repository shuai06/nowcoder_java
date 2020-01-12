package ch20_Java常用技巧;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 用HttpClient进行Post方式通信 {
    public static void main(String[] args) {
        new Post().start();
    }
}


class Post extends Thread{

    HttpClient client = HttpClients.createDefault();

    @Override
    public void run() {
        HttpPost post = new HttpPost("http://fanyi.youdao.com/openapi.do");
        try {
            List<BasicNameValuePair> parameters = new ArrayList<>();
            parameters.add(new BasicNameValuePair("keyfrom", "test"));
            parameters.add(new BasicNameValuePair("key", "test"));
            parameters.add(new BasicNameValuePair("type", "data"));
            parameters.add(new BasicNameValuePair("doctype", "xml"));
            parameters.add(new BasicNameValuePair("version", "1.1"));
            parameters.add(new BasicNameValuePair("q", "welcome"));

            post.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));
            HttpResponse response = client.execute(post);

            HttpEntity entity = response.getEntity();
            String str = EntityUtils.toString(entity, "UTF-8");
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

















