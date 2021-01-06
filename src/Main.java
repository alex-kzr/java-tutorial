import okhttp3.*;

import java.io.IOException;

public class Main {

    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {

        Main getExample = new Main();
        String response = getExample.run("https://raw.github.com/square/okhttp/master/README.md");
        System.out.println(response);
    }

}
