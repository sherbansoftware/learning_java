package NETWORKING.Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Client {

    private Socket client;
    private DataInputStream fromServer;
    private DataOutputStream toServer;
    private JFrame window;
    private JTextField input;
    private JTextArea chat;

    public Client() {

        // initialise chat window

        input = new JTextField();
        input.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // if key release is Enter key
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String message = input.getText();
                    if (message.length() > 0 && message.length() < 250) {
                        input.setText("");
                        chat.append("Me: " + message + "\n");
                        try {
                            send(message);
                        } catch (IOException ex) {
                            ex.printStackTrace(System.err);
                        }
                    }
                }

            }
        });
        chat = new JTextArea(34, 50);
        chat.setEditable(false);
        window = new JFrame("Networking");
        window.setVisible(true);
        window.setResizable(false);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(chat, BorderLayout.PAGE_START);
        window.add(input, BorderLayout.PAGE_END);

        // initialize networking
        try {

            client = new Socket(Server.HOST, Server.PORT);

            // this is used just for initial check
            if (client.isConnected()) {

                fromServer = new DataInputStream(client.getInputStream());
                toServer = new DataOutputStream(client.getOutputStream());

                // Receive a welcome message
                while (!client.isClosed()) {
                    receive();
                }

                // Send a message to server


            } else {
                System.err.println("Could not connect to the server");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace(System.err);
        }
    }

    private void receive() throws IOException {
        String message = fromServer.readUTF();
        chat.append(message + "\n");
    }

    private void send(String text) throws IOException {
        toServer.writeUTF(text);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        createObj(new Client());
    }

    public static void createObj(Client... clients) {

        for (Client client : clients) {
            new Client();
        }

    }
}
