package Java.Coupling;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ShoppingCartEntry sce = new ShoppingCartEntry ();
        ShoppingCart cart = new ShoppingCart ();
        cart.addInCart ("Sapun", 4.2f, 5);
        cart.addInCart ("Sapun", 4.2f, 5);
        cart.addInCart ("Balsam", 19.7f, 2);
        cart.addInCart ("Apa", 20.8f, 1);
        Order order = new Order (cart, 0.19f);
        System.out.format ("Total price : %.2f lei", order.orderTotalPrice ());


        Set<ShoppingCartEntry> products = cart.getItems ();
        List<ShoppingCartEntry> list = products.stream ().collect (Collectors.toList ());

        Collections.sort (list, (e1, e2) -> e1.getProductName ().compareTo (e2.getProductName ()));
        System.out.println ();

        list.forEach (l -> {
            System.out.println (l.getProductName () + " Quantity " + l.getQuantity () + " Price " +l.getPrice ());
        });

//        for (ShoppingCartEntry product : list) {
//             System.out.println ("Product name " + product.getProductName () + " Product price " + product.getPrice () + " Quantity " + product.getQuantity ());
//
//        }
    }
}
