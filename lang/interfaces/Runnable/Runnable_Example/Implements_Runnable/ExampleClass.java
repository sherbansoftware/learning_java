package lang.interfaces.Runnable.Runnable_Example.Implements_Runnable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// A simple thread example using runnable
public class ExampleClass implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        ExampleClass ex = new ExampleClass();
        Thread t1 = new Thread(ex);
        t1.start();
        System.out.println("Hi");
    }
}


  /*      Java Runnable Interface_Class
        Use of Runnable class in network programming
        The runnable class is used to perform multi-thread programming, especially in server-side as a server may be getting several requests from different clients. To tackle this in a fast and resource-efficient way, we use multi-thread programming.

        Example of a networking program using Runnable-
        The following program shows a server program which creates a thread, then creates a socket and waits for a client to connect to it and asks for an input string-

   */

class Example {

    public static void main(String[] args) {

        new Thread(new SimpleServer()).start();
    }

    static class SimpleServer implements Runnable {

        @Override
        public void run() {

            ServerSocket serverSocket = null;
            while (true) {

                try {
                    serverSocket = new ServerSocket(3333);

                    Socket clientSocket = serverSocket.accept();

                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    System.out.println("Client said :" + inputReader.readLine());


                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        serverSocket.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}