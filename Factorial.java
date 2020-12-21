package Chapter4;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {

//            int num = Integer.parseInt(JOptionPane.showInputDialog("enter number to get factorial"));
//            long factorial = 1;
//            for(int i = 1; i <= num; ++i)
//                //for(int i = num ; i >= 1 ; --i)
//            {
//                // factorial = factorial * i;
//                factorial *= i;
//            }
//            System.out.printf("Factorial of %d = %d", num, factorial);
//        }


        int num = Integer.parseInt(JOptionPane.showInputDialog("enter number to get factorial"));
        long factorial = 1;
        double e = 1;
        for (int i = 1; i <= num; ++i) {
            for (int j = num; j >= 1; --j) {
                factorial *= j;
            }
            e = e + (1 / factorial);

            System.out.printf("constant e of %d = %d", num, e);
        }
    }
}


