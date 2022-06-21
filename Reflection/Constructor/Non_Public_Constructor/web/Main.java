package Reflection.Constructor.Non_Public_Constructor.web;

import Reflection.Constructor.Non_Public_Constructor.web.init.ServerConfiguration;
import Reflection.Constructor.Non_Public_Constructor.web.init.WebServer;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21271158#questions/15936422

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        initConfiguration();
        WebServer webServer = new WebServer();
        webServer.startServer();
    }

    public static void initConfiguration() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ServerConfiguration> constructor =
                ServerConfiguration.class.getDeclaredConstructor(int.class, String.class);

        constructor.setAccessible(true);
        constructor.newInstance(8080, "Good Day!");
    }
}
