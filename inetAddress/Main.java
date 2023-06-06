import java.net.InetAddress;
import java.net.InetAddress.IPv4Address;
import java.net.UnknownHostException;
import java.net.URL;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws UnknownHostException, IOException {

    InetAddress inet = InetAddress.getByName("google.com");
    System.out.println(inet);
    System.out.println("Raw Address: "+ inet.getAddress());
    System.out.println("Is host reachable: "+ inet.isReachable(5000));
    
    IPv4Address ip4 = new IPv4Address()
  }
}
