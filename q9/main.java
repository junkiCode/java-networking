package q9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static final String blue = "\u001B[44m";
    public static final String red = "\u001B[41m";
    public static final String yello = "\u001B[43m";

    public static void main(String[] args) {
        String path = "q9/log.txt";
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(path));
            String log;
            int info = 0;
            int err = 0;
            int warning = 0;
            while ((log = buffer.readLine()) != null) {
                if (log.contains("INFO")) {
                    ++info;
                    System.out.print(blue + log);
                } else if (log.contains("ERROR")) {
                    ++err;
                    System.out.print(red + log);
                } else {
                    ++warning;
                    System.out.print(yello + log);
                }
                System.out.println();
            }
            System.out.println("Info: " + info + "\t Warning " + warning + "\t Error: " + err);
        } catch (IOException e) {
            System.out.println("Can't read file");
            e.printStackTrace();
        }
    }
}