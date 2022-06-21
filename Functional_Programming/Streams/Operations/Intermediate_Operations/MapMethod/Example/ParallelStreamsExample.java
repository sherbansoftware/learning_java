package Functional_Programming.Streams.Operations.Intermediate_Operations.MapMethod.Example;

import java.util.List;
import java.util.stream.Collectors;

import static util.CommonUtil.*;
import static util.LoggerUtil.log;

public class ParallelStreamsExample {


    public List<String> stringTransform(List<String> namesList){

        return namesList
                .stream()
                //.parallelStream()
                .map(this::addNameLengthTransform)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> namesList =  List.of("Bob", "Jamie", "Andrew", "Vasile", "Anna", "Kate");
        ParallelStreamsExample parallelStreamsExample = new ParallelStreamsExample();
        startTimer();
        List<String> resultList = parallelStreamsExample.stringTransform(namesList);
        log("resultList : " + resultList);
        timeTaken();

    }

    private  String addNameLengthTransform(String name) {
        delay(500);
        return name.length()+" - "+name ;
    }
}
