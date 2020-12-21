package Chapter4;

public class AnotherDangling_elseProblem {
    public static void main(String[] args) {
//    a) Assuming that x = 5 and y = 8 , the following output is produced:
//    @@@@@
//    $$$$$
//    &&&&&


        int y = 7;
        int x = 5;
/*
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }*/

//    b) Assuming that x = 5 and y = 8 , the following output is produced:
//       @@@@@
//
//        if (y == 8) {
//            if (x == 5) {
//                System.out.println("@@@@@");
//            } else {
//                System.out.println("#####");
//                System.out.println("$$$$$");
//                System.out.println("&&&&&");
//            }
//        }
//    }


//    c) Assuming that x = 5 and y = 8 , the following output is produced:
//    @@@@@

//
//        if (y == 8)
//            if (x == 5)
//                System.out.println("@@@@@");
//            else {
//                System.out.println("#####");
//                System.out.println("$$$$$");
//                System.out.println("&&&&&");
//            }
//    }

//    d) Assuming that x = 5 and y = 7 , the following output is produced. [Note: The last three
//    output statements after the else are all part of a block.]
//    #####
//    $$$$$
//    &&&&&


        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
    }
}





