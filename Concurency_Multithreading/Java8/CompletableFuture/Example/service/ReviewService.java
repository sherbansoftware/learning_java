package Concurency_Multithreading.Java8.CompletableFuture.Example.service;


import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Review;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.delay;

public class ReviewService {

    public Review retrieveReviews(String productId) {
        delay(1000);
        return new Review(200, 4.5);
    }
}
