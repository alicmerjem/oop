package week13.networkprogramming;
import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) {
        int port = 1234;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("server started. waiting for client...");

            // accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("client connected");

            // create io streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // read message from client
            String message = in.readLine();
            System.out.println("client says " + message);

            // reply to client
            out.println("hello client");

            // close resources
            socket.close();
            System.out.println("connection closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
