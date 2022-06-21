package Concurency_Multithreading.Java8.CompletableFuture.Example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Inventory {
    private int count;
}
