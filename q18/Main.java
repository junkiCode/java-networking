package q18;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6699);
        System.out.println("Socket server running on http://127.0.0.1:6699");
        while (true) {
            Socket socket = server.accept();
            ObjectOutputStream writer = new ObjectOutputStream(socket.getOutputStream());
            writer.writeObject("hello world");
            writer.close();
            socket.close();
            server.close();
        }
    }
}