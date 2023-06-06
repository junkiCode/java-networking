package q3;
import java.util.Scanner;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {
    public static void main(String[] arg) throws IOException, UnknownHostException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter host name: ");
        String hostName = in.nextLine();

        InetAddress net = InetAddress.getByName(hostName);
        System.out.println("Canonical Address===");
        System.out.println(net.getCanonicalHostName());
    }
}