package q2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {
    public static void main(String[] arg) throws UnknownHostException {

        InetAddress net = InetAddress.getLocalHost();
        System.out.println("My local address");
        System.out.println(net.getHostAddress());
    }
}