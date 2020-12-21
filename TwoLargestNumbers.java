package Chapter4;

import javax.swing.*;
import java.util.Arrays;

public class TwoLargestNumbers {


    private int number;
    private int secondLargest = 0;
    private int firstLargest = 0;


//    public void number() {
//        number = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBERS"));
//        if (number > firstLargest && number > secondLargest) {
//            firstLargest = number;
//
//            if (number > secondLargest && number < firstLargest) {
//                secondLargest = number;
//            }
//        }
//    }

    public void number() {
        number = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBERS"));
        if (number > firstLargest){
            secondLargest = firstLargest;
            firstLargest = number;


            if (number < firstLargest) {
                if (number > secondLargest){
                    secondLargest = number;
                }
            }
        }
    }



    public int getFirstLargestNumber() {
        return firstLargest;
    }

    public int getSecondLargestNumber() {
        return secondLargest;
    }




    public static void main(String[] args) {
        TwoLargestNumbers twoLargestNumbers = new TwoLargestNumbers();

        for ( int counter = 1;counter<=5;counter++){
            twoLargestNumbers.number();
        }

        System.out.println("first Largest = " + twoLargestNumbers.getFirstLargestNumber()+"\n"+
                "second Largest = "+ twoLargestNumbers.getSecondLargestNumber());


    }

    }