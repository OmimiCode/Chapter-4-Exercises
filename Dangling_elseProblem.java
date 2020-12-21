package Chapter4;

public class Dangling_elseProblem {

    public static void main(String[] args) {
        int x = 11;   // int x = 9;
        int y = 9;    // int y = 11;

        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
                System.out.println("$$$$$");


            if (x < 10) {
                if (y > 10)
                    System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
    }


