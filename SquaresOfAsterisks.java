package Chapter4;

import javax.swing.*;
import java.util.Scanner;

//   4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
//           of a square, then displays a hollow square of that size made of asterisks. Your program should work
//           for squares of all side lengths between 1 and 20.
public class SquaresOfAsterisks {
//    int counter = 1;
//    private String asterisks;
//
//
//    public void setSideAsterisks() {
//        int sides = Integer.parseInt(JOptionPane.showInputDialog("ENTER SIZE OF SIDES OF SQUARE"));
//
//        for (counter = 1; counter <= sides; ++counter) {
//            System.out.print("*");
//            for (counter = 1; counter <= sides; ++counter) {
//                System.out.print("*");
//            }
//
//        }
//    }

//    public static void main(String[] args) {
//        SquaresOfAsterisks squares = new SquaresOfAsterisks();
//        squares.setSideAsterisks();
//
//    }2
//}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sides = 0;

        // validate input
        while(sides == 0 || sides > 20){
            System.out.println("Enter a number between 1 and 20: ");
            int input = sc.nextInt();

            if(input > 0 && input <= 20)
                sides = input;
        }

        for(int i=0; i<sides; i++){
            // first and last rows
            if(i == 0  || i == sides-1){
                for(int j=0; j<sides; j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                // hollow portion (-2 as 1 * on each side)
                for(int j=0; j<sides-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}