import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class MidLABTEST_REDACTED {
    public static void main(String args[]) {
        
        JDialog.setDefaultLookAndFeelDecorated(true);
        String name = JOptionPane.showInputDialog("Enter your last name: ");
        String strN1 = JOptionPane.showInputDialog("Enter a first number: ");
        String strN2 = JOptionPane.showInputDialog("Enter a second number: ");

        int n1 = Integer.parseInt(strN1);
        int n2 = Integer.parseInt(strN2);

        int sum = n1 + n2;
        int diff = n1 - n2;
        int prod = n1 * n2;

        JOptionPane.showMessageDialog(null, "Last name: " + name + "\nSum: " + sum, "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference: " + diff, "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product: " + prod, "Output", JOptionPane.INFORMATION_MESSAGE);
        
        int quot;
        if (n1 == 0 || n2 == 0) {
            JOptionPane.showMessageDialog(null, "Quotient: undefined", "Output", JOptionPane.INFORMATION_MESSAGE);
        } else {
            quot = n1 / n2;
            JOptionPane.showMessageDialog(null, "Quotient: " + quot, "Output", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}