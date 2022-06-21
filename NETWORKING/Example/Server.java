package NETWORKING.Example;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    // global static variable
    public static final String HOST = "127.0.0.1";
    public static final int PORT = 6143;

    private ServerSocket server;

    // Client stuff
    private ArrayList<ClientSocket> connectedClients = new ArrayList<>();
    private Thread clientAcceptanceThread;

    public ArrayList<ClientSocket> getConnectedClients() {
        return connectedClients;
    }

    public Server() {

        try {
            server = new ServerSocket(Server.PORT);
            //Start accepting clients
            (clientAcceptanceThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            // Accept a new Client  --but accept blocks until connections is made
                            System.out.println("Listening for new Clients...");
                            // Socket newClient = server.accept(); -- we don't use this directly
                            ClientSocket newClient = new ClientSocket(server.accept());
                            System.out.println(" New client accepted");

                            // Add a new client to the array list
                            connectedClients.add(newClient);

                            // Send/receive welcome messages must take care or order send/receive with client
                            newClient.send("Welcome to the server, client:  " + newClient.hashCode());

                        } catch (Exception ioe) {
                            ioe.printStackTrace(System.err);
                        }

                    }
                }
            }, "Client Acceptance Thread")).start();

            // Manage existing client

            while (true) {
                ArrayList<Integer> disconnectedClients = new ArrayList<>();

                //Check for disconnected clients and send/receive messages
                for (int i = 0; i < connectedClients.size(); i++) {
                    ClientSocket client = connectedClients.get(i);
                    if (client.isConnected()) {
                        try {
                            String message = "Client " + i + ": " + client.receive();
                            //this loop take a message from a client and send to another client
                            for (int j = 0; j < connectedClients.size(); j++) {
                                if (i != j) {
                                    connectedClients.get(j).send(message);
                                }
                            }

                        } catch (Exception ex) {
                        }
                    } else {
                        disconnectedClients.add(i);
                    }
                }
                // remove disconnected clients
                for (int i : disconnectedClients) {
                    disconnectedClients.remove(i);
                }
            }

        } catch (Exception ioe) {
            ioe.printStackTrace(System.err);
        }

    }

    public static void main(String[] args) {
        new Server();
    }

}
