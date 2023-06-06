package q13;

import java.io.FileWriter;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter url to download page: ");
            String path = "q13/result.html";
            String address = in.nextLine();
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            BufferedInputStream res = new BufferedInputStream(connection.getInputStream());
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            int bt;
            while ((bt = res.read()) != -1) {
                writer.write(bt);
            }
            System.out.println("Page downloaded :)");
            writer.close();
            res.close();
            in.close();
        } catch (Exception error) {
            System.out.println("Ops someting went wrong");
            error.printStackTrace();
        }
    }
}