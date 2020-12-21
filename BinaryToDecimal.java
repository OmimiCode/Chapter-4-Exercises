package Chapter4;
import java.util.Scanner;
//4.31 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs an
//        integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use
//        the remainder and division operators to pick off the binary number’s digits one at a time, from right
//        to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
//        digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
//        can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
//        a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
//        The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
// Exercise 4.31 Solution: Binary.java
// Program prints the decimal equivalent of a binary number.
public class BinaryToDecimal {
    public static void main(String[] args) {

        // converts a binary number to decimal

            Scanner input = new Scanner( System.in );
            int binary; // binary value
            int position; // bit positional value
            int decimal; // decimal value

            position = 1;
            decimal = 0;

            // prompt for and read in a binary number
            System.out.print( "Enter a binary number: " );
            binary = input.nextInt();

            // convert to decimal equivalent
            while ( binary != 0 )
            {
                decimal += binary % 10 * position;
                binary /= 10;
                position *= 2;
            } // end while loop

            System.out.printf( "Decimal is: %d\n", decimal );
        } // end method convertToDecimal

    }// end class Binary

