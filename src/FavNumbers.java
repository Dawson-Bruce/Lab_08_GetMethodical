import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "Please enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Please enter your favorite double");

        System.out.println("");
        System.out.println("Your favorite number is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}
