package Reflection.Constructor.Non_Public_Constructor.web.init;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21271158#questions/15936422

public class WebServer {

    public void startServer() throws IOException {
        HttpServer httpServer = HttpServer.create(ServerConfiguration.getInstance().getServerAddress(), 0);

        httpServer.createContext("/greetings").setHandler(exchange -> {

            String responseMessage = ServerConfiguration.getInstance().getGreetingMessage();

            exchange.sendResponseHeaders(200, responseMessage.length());

            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(responseMessage.getBytes());
            responseBody.flush();
            responseBody.close();
        });


        System.out.println(String.format("Starting server on address %s:%d",
                ServerConfiguration.getInstance().getServerAddress().getHostName(),
                ServerConfiguration.getInstance().getServerAddress().getPort()));

        httpServer.start();
    }
}
