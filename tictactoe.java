import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        // Initialize the 3x3 game grid
        int[][] grid = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        // Game loop
        while (!gameWon) {
            // Print the current state of the grid
            printGrid(grid);

            // Get user input for row and column
            System.out.print("Enter row (0, 1, or 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, or 2): ");
            int col = scanner.nextInt();

            // Place a "1" in the specified position
            if (grid[row][col] == 0) { // Check if the cell is empty
                grid[row][col] = 1;

                // Check if the player has won
                if (checkRow(grid, row)) {
                    printGrid(grid);
                    System.out.println("Congratulations! You won!");
                    gameWon = true;
                }
            } else {
                System.out.println("This cell is already taken, try again.");
            }
        }

        scanner.close();
    }

    // Method to print the game grid
    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Method to check if all elements in a row are "1"
    public static boolean checkRow(int[][] grid, int row) {
        for (int cell : grid[row]) {
            if (cell != 1) {
                return false;
            }
        }
        return true;
    }
}
