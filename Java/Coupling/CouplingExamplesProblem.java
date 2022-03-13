package Java.Coupling;

//Coupling is a measure of how much a class is dependent on other classes. 
//There should minimal dependencies between classes.
//Consider the example below:

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class ShoppingCartEntry {
    private String productName;
    private float price;
    private int quantity;

    public ShoppingCartEntry() {
    }

    public ShoppingCartEntry(String productName, float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.productName = productName;

    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        ShoppingCartEntry that = (ShoppingCartEntry) o;
        return Float.compare (that.price, price) == 0 && quantity == that.quantity && productName.equals (that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash (productName, price, quantity);
    }
}

class ShoppingCart {
    public Set<ShoppingCartEntry> items;

    public ShoppingCart() {
        items = new HashSet<> ();
    }

    public Set<ShoppingCartEntry> addInCart(String productName, float price, int quantity) {
        items.add (new ShoppingCartEntry (productName, price, quantity));
        return items;
    }

    public Set<ShoppingCartEntry> getItems() {
        return items;
    }
}

class Order {
    private ShoppingCart cart;
    private float salesTax;

    public Order(ShoppingCart cart, float salesTax) {
        this.cart = cart;
        this.salesTax = salesTax;
    }

    // This method know the internal details of ShoppingCartEntry and
    // ShoppingCart classes. If there is any change in any of those
    // classes, this method also needs to change.
    public float orderTotalPrice() {
        float cartTotalPrice = 0;
        for (ShoppingCartEntry sc : cart.items) {
            cartTotalPrice += sc.getPrice () * sc.getQuantity ();
        }
        cartTotalPrice += cartTotalPrice * salesTax;
        return cartTotalPrice;
    }
}

public class CouplingExamplesProblem {

}
