package br.exemplos.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * A simple TCP server. When a client connects, it sends the client the current
 * datetime, then closes the connection. This is arguably the simplest server
 * you can write. Beware though that a client has to be completely served its
 * date before the server will be able to handle another client.
 */
public class DateServer {
    public static void main(String[] args) throws IOException {
   
    	    ServerSocket listener = new ServerSocket(59090);
            System.out.println("The date server is running...");
            while (true) {
                	Socket socket = listener.accept();
//                	System.out.println(listener.toString());
//                	System.out.println(socket.getLocalAddress().toString());
//                	PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
//                	System.out.println(args[0]);
                	System.out.println(new Date().toString());
                	
            }
    }
}