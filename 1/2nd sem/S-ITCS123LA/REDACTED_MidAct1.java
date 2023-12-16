import java.util.Scanner;
import java.text.DecimalFormat;

public class REDACTED_MidAct1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");
        double x1, y1, x2, y2, d;
        
        System.out.println("First point: ");
        System.out.print("\tEnter x1: ");
        x1 = console.nextFloat();
        System.out.print("\tEnter y1: ");
        y1 = console.nextFloat();
        System.out.println("Second point: ");
        System.out.print("\tEnter x2: ");
        x2 = console.nextFloat();
        System.out.print("\tEnter y2: ");
        y2 = console.nextFloat();

        d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("Distance between two points is " + df.format(d));
    }
}
