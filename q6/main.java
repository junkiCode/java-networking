package q6;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws MalformedURLException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Address 1:");
        String address1 = in.nextLine();
        System.out.println("Enter Address 2:");
        String address2 = in.nextLine();

        URL url1 = new URL(address1);
        URL url2 = new URL(address2);
        System.out.println(url1.getHost());
        System.out.println(url2.getHost());

    }
}
