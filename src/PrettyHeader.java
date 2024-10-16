import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SafeInput.prettyHeader(SafeInput.getNonZeroLenString(in, "Please enter your header message"));
    }
}
