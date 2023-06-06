package q12;

import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter random number between 1-100 to fetch post: ");
            String query = in.nextLine();
            URL url = new URL("https://jsonplaceholder.typicode.com/posts?id=" + query);
            HttpURLConnection req = (HttpURLConnection) url.openConnection();
            req.setRequestMethod("GET");
            BufferedInputStream pokemonBuf = new BufferedInputStream(req.getInputStream());
            int bt;
            while ((bt = pokemonBuf.read()) != -1) {
                System.out.print((char) bt);
            }
            in.close();
            req.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}