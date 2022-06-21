package Concurency_Multithreading.Java8.CompletableFuture.Example.service;


import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Inventory;
import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.ProductOption;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.delay;

public class InventoryService {
    public Inventory retrieveInventory(ProductOption productOption) {
        delay(500);
        return Inventory.builder()
                .count(2).build();

    }
}
