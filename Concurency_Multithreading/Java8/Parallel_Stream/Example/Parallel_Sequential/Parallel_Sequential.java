package Concurency_Multithreading.Java8.Parallel_Stream.Example.Parallel_Sequential;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static util.CommonUtil.*;
import static util.LoggerUtil.log;

public class Parallel_Sequential {

    public List<String> stringTransform(List<String> namesList) {

        return namesList
                .parallelStream()
                .map(this::addNameLengthTransform)
                .sequential()
                .collect(Collectors.toList());
    }

    public List<String> stringTransform(List<String> namesList, boolean isParallel) {

        Stream<String> nameStream = namesList.stream();

        if (isParallel) {
           nameStream.parallel();
        }

        return nameStream
                .map(this::addNameLengthTransform)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        List<String> namesList = List.of("Angela", "Anne", "Bob", "Mary");
        Parallel_Sequential parallelSequential = new Parallel_Sequential();
        startTimer();
        List<String> resultList = parallelSequential.stringTransform(namesList, true);
        log("resultList : " + resultList);
        timeTaken();

    }

    private String addNameLengthTransform(String name) {
        delay(500);
        return name.length() + " - " + name;
    }
}

