import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0;

        do {
            cost += SafeInput.getRangedDouble(in, "Please enter the price of your item", 0, 10);
        }while (SafeInput.getYNConfirm(in, "Continue? [Y/N]"));

        System.out.printf("\nThe total cost is: $%.2f", cost);
    }
}