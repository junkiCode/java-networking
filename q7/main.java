package q7;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.net.SocketException;

public class main {
    public static void main(String[] args) throws SocketException {
        Enumeration networkInterfaceList = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaceList.hasMoreElements()) {
            System.out.println(networkInterfaceList.nextElement());
        }
    }
}