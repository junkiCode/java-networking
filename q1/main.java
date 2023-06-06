package q1;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress net = InetAddress.getByName("google.com");
        System.out.println(net.toString());
    }
}