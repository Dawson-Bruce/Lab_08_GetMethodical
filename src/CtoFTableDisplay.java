public class CtoFTableDisplay
{
    public static double CtoF(double Celsius) {
        double conversion = 9/5;
        double fahrenheit = Celsius * ((double) 9/5) + 32;

        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.printf("%5s %15s", "C", "F");
        for (double count = -100; count <= 100; count++) {
            System.out.println("");
            System.out.printf("%5.0f %15.1f", count, CtoF(count));
        }
    }
}