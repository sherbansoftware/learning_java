package Reflection.Constructor.Non_Public_Constructor.web.init;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21271158#questions/15936422

import java.net.InetSocketAddress;

public class ServerConfiguration {
    private static ServerConfiguration serverConfigurationInstance;

    private final InetSocketAddress serverAddress;
    private final String greetingMessage;

    private ServerConfiguration(int port, String greetingMessage) {
        this.greetingMessage = greetingMessage;
        this.serverAddress = new InetSocketAddress("localhost", port);
        if (serverConfigurationInstance == null) {
            serverConfigurationInstance = this;
        }
    }

    public static ServerConfiguration getInstance() { return serverConfigurationInstance; }

    public InetSocketAddress getServerAddress() { return this.serverAddress; }

    public String getGreetingMessage() { return this.greetingMessage; }
}
