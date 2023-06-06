package q10;

import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;

public class main {
    public static void main(String[] args) throws MalformedURLException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter url: ");
        String address = in.next();

        if (!address.contains("http") || !address.contains("https") || !address.contains("ftp")) {
            address = "https://" + address;
        }
        /**
         * Protocol
         * host
         * port
         * path
         * query
         * user_info
         * authority
         */
        URL url = new URL(address);
        println("Protocol: " + url.getProtocol());
        println("Host: " + url.getHost());
        println("Port: " + url.getDefaultPort());
        println("User info: " + url.getUserInfo());
        println("Authority: " + url.getAuthority());
        println("Path: " + url.getPath());
        println("Query: " + url.getQuery());
        in.close();
    }

    public static void println(String str) {
        System.out.println(str);
    }
}