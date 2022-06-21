package Concurency_Multithreading.Java8.CompletableFuture.Example;


import Concurency_Multithreading.Java8.CompletableFuture.Example.service.HelloWorldService;

import java.util.concurrent.CompletableFuture;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.*;
import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.LoggerUtil.log;


public class CompletableFutureHelloWorld {

    private HelloWorldService hws;

    public CompletableFutureHelloWorld(HelloWorldService hws) {
        this.hws = hws;
    }

    public CompletableFuture<String> helloWorld() {

        return CompletableFuture.supplyAsync(hws::helloWorld)
                .thenApply(String::toUpperCase)
                /*.join()*/;
    }

    public String helloWorld_approach1() {

        String hello = hws.hello();
        String world = hws.world();
        return hello + world;
    }

    public String helloworld_muliple_async_calls() {
        startTimer();

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());

        String hw = hello
                .thenCombine(world, (h, w) -> h + w) // first, second
                .thenApply(String::toUpperCase)
                .join();

        timeTaken();
        return hw;
    }

    public String helloworld_3_async_calls() {
        startTimer();

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());
        CompletableFuture<String> hiCompletableFuture = CompletableFuture.supplyAsync(() -> {
            delay(1000);
            return " Hi CompletableFuture!";
        });

        String hw = hello
                .thenCombine(world, (h, w) -> h + w) // first, second
                .thenCombine(hiCompletableFuture, (previous, current) -> previous + current)
                .thenApply(String::toUpperCase)
                .join();

        timeTaken();
        return hw;
    }

    public String helloworld_3_async_calls_log() {
        startTimer();

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> hws.hello());
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> hws.world());
        CompletableFuture<String> hiCompletableFuture = CompletableFuture.supplyAsync(() -> {
            delay(1000);
            return " Hi CompletableFuture!";
        });

        String hw = hello
                .thenCombine(world, (h, w) -> {
                    log("thenCombine h/w");
                    return h + w;
                }) // first, second
                .thenCombine(hiCompletableFuture, (previous, current) -> {
                    log("thenCombine previous/current");
                    return previous + current;
                })
                .thenApply(s -> {
                    log("thenApply");
                    return s.toUpperCase();
                })
                .join();

        timeTaken();
        return hw;
    }

    public CompletableFuture<String> helloWorld_thenCompose() {

        return CompletableFuture.supplyAsync(hws::hello)
                .thenCompose((previous) -> hws.worldFuture(previous))
                .thenApply(String::toUpperCase)
                /*.join()*/;
    }


    public static void main(String[] args) {

        HelloWorldService hws = new HelloWorldService();

        CompletableFuture.supplyAsync(hws::helloWorld)
                .thenApply(String::toUpperCase)
                .thenAccept((result) -> {
                    log("Result is : " + result);
                })
                .join();
        log("Done!");
        //delay(2000);
    }
}
