package Chapter4;

import javax.swing.*;
import java.util.Arrays;

public class LargestNumber {



    private int number;
    private int largest=0;

    public void input() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER TO FIND MAXIMUM"));
        this.number = number;
    }

    public int getInput() {
        return number;
    }

    public void maximum() {

        if (number >= largest) {
            this.largest = number;
        }
    }

    public int getMaximum() {
        return largest;
    }


    public static void main(String[] args) { 
        LargestNumber largestNumber = new LargestNumber();
        for (int counter = 1; counter <= 10; counter++) {
                largestNumber.input();
                largestNumber.maximum();
        }
                System.out.println("largest = " + largestNumber.getMaximum());

            }
        }


