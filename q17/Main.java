package q17;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://pyxis.vercel.app");
        URLConnection con = url.openConnection();
        System.out.println("Last time URL changed at "+ con.getLastModified());
    }
}