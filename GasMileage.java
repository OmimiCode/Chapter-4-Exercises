package Chapter4;
/*4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
        The program should calculate and display the miles per gallon obtained for each trip and print the
        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
        data from the user.
        For Exercise 4.17 through Exercise 4.20, perform each of the following steps:
        a) Read the problem statement.
        b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
        c) Write a Java program.*/
//Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.

//        Initialize variables
//        Input, sum and count the trip base on the miles and gallons used
//        Calculate and print the trip average result



//        Initialize totalTrip to zero
//        Initialize counter to zero


//        Prompt the user to enter the first Trips miles
//        Input the first Trips miles (possibly the sentinel)
//        Prompt the user to enter the first Trips gallon used
//        Input the first Trips gallon used (possibly the sentinel)
//        While the user has not yet entered the sentinel
//        calculate the mileage by miles/gallons
//        Add this mileage into the running total
//        Add one to the  counter
//        Prompt the user to enter the next trip and gallons
//        Input the next trip mile and gallon (possibly the sentinel)



//        If the counter is not equal to zero
//        Set the average to the total divided by the counter
//        Print the average
//        else
//        Print “No trip were entered”
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class GasMileage {


    public int milesDriven;
    public int gallonsUsed;
    private int totalMileage= 0;
    int counter = 1;


    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }



    public double calculateGasMillage() {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("ENTER MILES DRIVEN OR -1 TO TERMINATE");
       int miles = scanner.nextInt();
        System.out.println("ENTER GALLONS USED OR -1 TO TERMINATE");
        int gallons = scanner.nextInt();


//        int miles = Integer.parseInt(JOptionPane.showInputDialog("ENTER MILES DRIVEN"));
//        int gallons = Integer.parseInt(JOptionPane.showInputDialog("ENTER GALLONS USED"));

        while (gallons!=-1 || miles !=-1){
            int mileage = miles / gallons;
            System.out.println( "mileage "+ counter + "= "+ mileage);
             totalMileage += mileage;
             counter++;

            System.out.println("ENTER MILES DRIVEN OR -1 TO TERMINATE" );
            miles = scanner.nextInt();
            System.out.println("ENTER GALLONS USED OR -1 TO TERMINATE");
            gallons = scanner.nextInt();

//            miles = Integer.parseInt(JOptionPane.showInputDialog("ENTER MILES DRIVEN"));
//            gallons = Integer.parseInt(JOptionPane.showInputDialog("ENTER GALLONS USED"));

        }if(counter !=0){
            double averageMileage = (double)totalMileage/counter;
            System.out.println( "Average mileage for  "+ (counter-1) + " Trips = "+ averageMileage);

        }else{
            System.out.println("no trip taken");
        }
        return totalMileage;
    }
}
