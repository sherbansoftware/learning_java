package Concurency_Multithreading.Java8.CompletableFuture.Example.util;

public class LoggerUtil {

    public static void log(String message){

        System.out.println("[" + Thread.currentThread().getName() +"] - " + message);

    }
}
