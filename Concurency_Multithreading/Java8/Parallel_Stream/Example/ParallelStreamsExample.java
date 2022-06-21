package Concurency_Multithreading.Java8.Parallel_Stream.Example;


import java.util.List;
import java.util.stream.Collectors;

import static util.CommonUtil.*;
import static util.LoggerUtil.log;


public class ParallelStreamsExample {


    public List<String> stringTransform(List<String> namesList) {

        return namesList
                //.stream()
                .parallelStream()
                .map(this::addNameLengthTransform)
                .sequential()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> namesList = List.of("Angela", "Anne", "Bob", "Mary");
        ParallelStreamsExample parallelStreamsExample = new ParallelStreamsExample();
        startTimer();
        List<String> resultList = parallelStreamsExample.stringTransform(namesList);
        log("resultList : " + resultList);
        timeTaken();

    }

    private String addNameLengthTransform(String name) {
        delay(500);
        return name.length() + " - " + name;
    }
}
