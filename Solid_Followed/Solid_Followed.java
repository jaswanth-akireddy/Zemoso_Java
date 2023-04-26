package Solid_Followed;

import java.util.*;
interface CartItem {
    String getName();
    double getPrice();
}

class Product implements CartItem {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

interface Cart {
    void addItem(CartItem item);
    void removeItem(CartItem item);
    double getTotalPrice();
}

class ShoppingCart implements Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}

class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart cart = new ShoppingCart();
        CartItem item1 = new Product("iPhone X", 999.99);
        CartItem item2 = new Product("MacBook Pro", 1999.99);
        cart.addItem(item1);
        cart.addItem(item2);
        System.out.println("Total price: " + cart.getTotalPrice());
    }
}
