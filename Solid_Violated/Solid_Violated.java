package Solid_Violated;
import java.util.*;

class CartItem {
    private String name;
    private double price;
 
    public CartItem(String name, double price) {
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
 
  class ShoppingCart {
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
 
    public void calculateTax() {
       double tax = getTotalPrice() * 0.1;
       System.out.println("Tax: " + tax);
    }
 
    public void printItems() {
       for (CartItem item : items) {
          System.out.println(item.getName() + " - " + item.getPrice());
       }
    }
 }
 
 public class Solid_Violated {
    public static void main(String[] args) {
       ShoppingCart cart = new ShoppingCart();
       CartItem item1 = new CartItem("One Plus 11 r", 39999);
       CartItem item2 = new CartItem("galaxy book s", 29999999);
       cart.addItem(item1);
       cart.addItem(item2);
       cart.printItems();
       cart.calculateTax();
       System.out.println("Total price: " + cart.getTotalPrice());
    }
 }
 