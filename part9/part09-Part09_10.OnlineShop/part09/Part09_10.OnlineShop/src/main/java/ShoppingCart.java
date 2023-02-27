import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Item item : cart.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
