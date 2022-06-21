package Concurency_Multithreading.Java8.Parallel_Stream.Example;

import Concurency_Multithreading.Java8.Parallel_Stream.Example.Parallel_Sequential.Parallel_Sequential;
import org.junit.jupiter.api.Test;

import java.util.List;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.startTimer;
import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.timeTaken;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParallelStreamsExampleTest {

    ParallelStreamsExample parallelStreamsExample = new ParallelStreamsExample();
    Parallel_Sequential parallelSequential = new Parallel_Sequential();

    @Test
    void stringTransform() {
        // given
        List<String> inputList = List.of("Bob", "John", "Anne", "Clark");

        // when
        // startTimer();
        List<String> resultList = parallelStreamsExample.stringTransform(inputList);
        //  timeTaken();
        // then
        assertEquals(4, resultList.size());
        resultList.forEach(name ->
                assertTrue(name.contains("-")));
    }

//    @ParameterizedTest
//    @ValueSource(booleans = {false, true})
    void stringTransform1(boolean isParallel) {
        // given
        List<String> inputList = List.of("Bob", "John", "Anne", "Clark");

        // when
        startTimer();
        List<String> resultList = parallelSequential.stringTransform(inputList, isParallel);
        timeTaken();

        // then
        assertEquals(4, resultList.size());
        resultList.forEach(name ->
                assertTrue(name.contains("-")));
    }

}