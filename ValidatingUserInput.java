package Chapter4;

import java.util.Scanner;


    // Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses class Scanner
//    public class Analysis{
public class ValidatingUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {

            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = scanner.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else {
                if (result == 2) {
                    failures = failures + 1;
                } else {
                    break;
                }

                studentCounter = studentCounter + 1;
            }

            System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

            if (passes > 8)
                System.out.println("Bonus to instructor!");

        }
    }
}