import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

    //private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main(String[] args){

        HttpPost httpPost = new HttpPost("https://jsonplaceholder.typicode.com/posts");
        httpPost.addHeader("content-type", "application/json");
        
        StringBuilder postJsonString = new StringBuilder();

        postJsonString.append("{");
        postJsonString.append("\"title\": \"foo\",");
        postJsonString.append("\"body\": \"bar\",");
        postJsonString.append("\"userId\": 115");
        postJsonString.append("}");

        String result = "";

        try {
            httpPost.setEntity(new StringEntity(postJsonString.toString()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(httpPost)) {

            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
