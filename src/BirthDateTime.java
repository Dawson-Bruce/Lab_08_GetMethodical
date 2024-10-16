import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthDay = 0;
        int birthYear = SafeInput.getRangedInt(in, "Please enter your birth year [1950-2015]", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Please enter your birth month [1-12]", 1, 12);

        switch (birthMonth) {
            case 4,6,9,11:
                birthDay = SafeInput.getRangedInt(in, "Please enter your birth day [1-30]", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Please enter your birth day [1-29]", 1, 29);
                break;
            default:
                birthDay = SafeInput.getRangedInt(in, "Please enter your birth day [1-31]", 1, 31);
        }

        int birthHour = SafeInput.getRangedInt(in, "Please enter your birth hour [1-24]", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Please enter your birth minute [1-59]", 1, 59);

        System.out.println("\nYour time of birth is " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute + ".");
    }
}
