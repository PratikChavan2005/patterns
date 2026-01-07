import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number recommended): ");
        int rw = sc.nextInt();
        sc.close();

        // Print the upper half of the diamond
        for (int i = 1; i <= rw; i++) {
            printItems(rw, i);
        }

        // Print the lower half of the diamond (excluding the middle row again)
        for (int i = rw - 1; i > 0; i--) {
            printItems(rw, i);
        }
    }

    public static void printItems(int rw, int i) {
        // Print leading spaces
        for (int j = 1; j <= rw - i; j++) {
            System.out.print(" ");
        }

        // Print stars and inner spaces
        for (int k = 1; k <= i * 2 - 1; k++) {
            // Print a star only at the first or last position of the row
            if (k == 1 || k == i * 2 - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to the next line
    }
}