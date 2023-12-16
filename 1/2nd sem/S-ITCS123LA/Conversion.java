package conversion;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        double yen; // Japanese Yen (JPY)
        final double conv = 0.4491; // 1 JPY = 0.4491 PHP
        double result;
        Scanner input = new Scanner (System.in);
        System.out.print("Input amount in ¥: ");
        yen = input.nextDouble();
        result = yen * conv;
        System.out.println("Equivalent in PhP = ₱" + result);
    }
}
