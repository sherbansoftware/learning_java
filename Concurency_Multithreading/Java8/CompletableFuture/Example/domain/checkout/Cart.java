package Concurency_Multithreading.Java8.CompletableFuture.Example.domain.checkout;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {

    private Integer cardId;
    private List<CartItem> cartItemList;

}
