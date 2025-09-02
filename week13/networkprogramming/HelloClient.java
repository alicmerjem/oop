package week13.networkprogramming;
import java.io.*;
import java.net.*;

public class HelloClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1234;

        try {
            Socket socket = new Socket(host, port);

            // create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader((socket.getInputStream())));
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            // send message to server
            out.println("hello server");
            
            // receive reply
            String reply = in.readLine();
            System.out.println("server says " + reply);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
