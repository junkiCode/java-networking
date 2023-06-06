package q15;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException, IOException {
        URL url = new URL("https://facebook.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        Map<String, List<String>> fields = conn.getHeaderFields();
        for (Object field : fields.keySet()) {
            System.out.println(fields.get(field));
        }
    }
}