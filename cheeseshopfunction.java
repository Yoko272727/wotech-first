import java.util.ArrayList;
import java.util.List;

public class CheeseShop {
    private List<String> availableCheeses;
    private List<String> cart;

    public CheeseShop() {
        availableCheeses = new ArrayList<>();
        cart = new ArrayList<>();
    }

    // Method to add cheese to the shop
    public void addCheese(String cheese) {
        availableCheeses.add(cheese);
        System.out.println(cheese + " added to the shop.");
    }

    // Method to remove cheese from the shop
    public void removeCheese(String cheese) {
        if (availableCheeses.remove(cheese)) {
            System.out.println(cheese + " removed from the shop.");
        } else {
            System.out.println(cheese + " is not available in the shop.");
        }
    }

    // Method to list available cheeses in the shop
    public List<String> getAvailableCheeses() {
        return new ArrayList<>(availableCheeses);
    }

    // Method to add cheese to the cart
    public void addToCart(String cheese) {
        if (availableCheeses.contains(cheese)) {
            cart.add(cheese);
            System.out.println(cheese + " added to the cart.");
        } else {
            System.out.println(cheese + " is not available in the shop.");
        }
    }

    // Method to remove cheese from the cart
    public void removeFromCart(String cheese) {
        if (cart.remove(cheese)) {
            System.out.println(cheese + " removed from the cart.");
        } else {
            System.out.println(cheese + " is not in the cart.");
        }
    }

    // Method to get all cheeses in the cart
    public List<String> getCartCheeses() {
        return new ArrayList<>(cart);
    }
}
