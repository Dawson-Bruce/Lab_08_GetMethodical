import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Please enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("");
        String mNumber = SafeInput.getRegExString(in, "Please enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("");
        String menuChoice = SafeInput.getRegExString(in, "Please select a menu choice [O,S,V,Q]", "^[OoSsVvQq]$");
        System.out.println("");
        System.out.println("Your SSN is : " + ssn);
        System.out.println("Your UC Student M number is: " + mNumber);
        System.out.println("Your menu choice was: " + menuChoice);
    }
}