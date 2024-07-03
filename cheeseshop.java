import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheeseService cheeseService = new CheeseService();
        CheeseShop cheeseShop = cheeseService.getCheeseShop();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add cheese to shop");
            System.out.println("2. Remove cheese from shop");
            System.out.println("3. List available cheeses");
            System.out.println("4. Add cheese to cart");
            System.out.println("5. Remove cheese from cart");
            System.out.println("6. List cheeses in cart");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter a type of cheese to add: ");
                String cheeseToAdd = scanner.nextLine();
                cheeseShop.addCheese(cheeseToAdd);
            } else if (choice == 2) {
                System.out.print("Enter a type of cheese to remove: ");
                String cheeseToRemove = scanner.nextLine();
                cheeseShop.removeCheese(cheeseToRemove);
            } else if (choice == 3) {
                System.out.println("Available cheeses in the shop: " + cheeseShop.getAvailableCheeses());
            } else if (choice == 4) {
                System.out.print("Enter a type of cheese to add to cart: ");
                String cheeseToCart = scanner.nextLine();
                cheeseShop.addToCart(cheeseToCart);
            } else if (choice == 5) {
                System.out.print("Enter a type of cheese to remove from cart: ");
                String cheeseFromCart = scanner.nextLine();
                cheeseShop.removeFromCart(cheeseFromCart);
            } else if (choice == 6) {
                System.out.println("Cheeses in cart: " + cheeseShop.getCartCheeses());
            } else if (choice == 7) {
                exit = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
