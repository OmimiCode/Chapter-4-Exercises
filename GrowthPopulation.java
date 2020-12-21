package Chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class GrowthPopulation {
    private static int year = 75;



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long worldPopulation = input.nextLong();

        System.out.print("Enter annual world population growth rate: ");
        double growthRate = input.nextDouble();


            int yearCounter =1;
        System.out.println( "\t"+"year"+"\t"+"Anticipated world population"+"\t"+"growth Rate");
        System.out.println( "\t"+yearCounter+"\t"+"\t"+"\t"+worldPopulation+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+growthRate);

        yearCounter++;
            while( yearCounter <= year){
                worldPopulation*=growthRate;

                System.out.println( "\t"+yearCounter+"\t"+"\t"+"\t"+worldPopulation+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+growthRate);
                yearCounter++;
            }

        }
    }
