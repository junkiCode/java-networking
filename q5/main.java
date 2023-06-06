package q5;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws UnknownHostException, IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Host address: ");
        String address = in.nextLine();
        InetAddress net = InetAddress.getByName(address);
        String ipClass = net.getClass().getSimpleName();
        if(ipClass.compareTo("Inet4Address") == 0){
            System.out.println(address + " is IpV4");
        }
        else {
            System.out.println(address + " is IpV6");
        }
    }
}