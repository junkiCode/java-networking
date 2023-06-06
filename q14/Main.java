package q14;
import java.net.URL;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException, IOException{
        URL url = new URL("https://facebook.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        System.out.println("Request Content-Type: " +conn.getContentType());
    }
}