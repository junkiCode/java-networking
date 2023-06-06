package q11;

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter url to download page: ");
            String path = "q11/result.html";
            String address = in.nextLine();
            URL url = new URL(address);
            BufferedInputStream data = new BufferedInputStream(url.openStream());
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            int byt;
            while ((byt = data.read()) != -1) {
                writer.write(byt);
            }
            System.out.println("Page downloaded successfully ;)");
            writer.close();
            in.close();
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println("Can't read/write file");
            } else if (e instanceof MalformedURLException) {
                System.out.println("Invalid url");
            }
            e.printStackTrace();
        }
    }
}