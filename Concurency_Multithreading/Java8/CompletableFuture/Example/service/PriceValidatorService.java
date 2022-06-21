package Concurency_Multithreading.Java8.CompletableFuture.Example.service;


import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.checkout.CartItem;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.delay;
import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.LoggerUtil.log;

public class PriceValidatorService {

    public boolean  isCartItemInvalid(CartItem cartItem){
        int cartId = cartItem.getItemId();
        log("isCartItemInvalid : " + cartItem);
        delay(500);
        if (cartId == 7 || cartId == 9 || cartId == 11) {
            return true;
        }
        return false;
    }
}
