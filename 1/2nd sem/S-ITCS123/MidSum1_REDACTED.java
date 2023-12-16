import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MidSum1_REDACTED {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String studentNumber, firstName, middleInitial, lastName, programCode;
        int studentCounter = 0;
        FileReader students = new FileReader("C:\\studentRecord.txt");
        PrintWriter output = new PrintWriter("output.txt"); // same dir as this file
        Scanner file = new Scanner(students);
        String inputCode = JOptionPane.showInputDialog(null, "Enter valid program code: ", "Input", JOptionPane.QUESTION_MESSAGE);

        while (file.hasNext()) {
            studentNumber = file.next();
            firstName = file.next();
            middleInitial = file.next();
            lastName = file.next();
            programCode = file.next();
            if (inputCode.equals(programCode)) {
                System.out.println(firstName + "\t" + middleInitial + "\t" + lastName);
                studentCounter++;
            }
        }

        if (studentCounter > 0) {
            output.write(inputCode + "\t" + studentCounter);
            output.close();
        } else
            System.out.println("No matches found.");

        students.close();
        file.close();
    }
}