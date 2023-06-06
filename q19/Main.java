package q19;

import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InetAddress host = InetAddress.getLocalHost();
        Socket client = new Socket(host, 6699);
        System.out.println("Established Socket connection...");
        ObjectInputStream res = new ObjectInputStream(client.getInputStream());
        System.out.println((String)res.readObject());
        client.close();
    }
}