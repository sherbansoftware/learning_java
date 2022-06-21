package Concurency_Multithreading.Java8.CompletableFuture.Example.domain;

import lombok.*;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Product {

    @NonNull
    private String productId;
    @NonNull
    private ProductInfo productInfo;
    @NonNull
    private Review review;

    public Product(@NonNull String productId, @NonNull ProductInfo productInfo, @NonNull Review review) {
        this.productId = productId;
        this.productInfo = productInfo;
        this.review = review;
    }
}
