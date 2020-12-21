package Chapter4;
   /* 4.34 (What’s Wrong with This Code?) What is wrong with the following statement? Provide the
    correct statement to add one to the sum of x and y .
            System.out.println(++(x + y));*/
public class WrongCode {

       public static void main(String[] args) {
           int x=5;
           int y=2;
//           System.out.println(++(x + y));  wrong
//          int sum = x+y;
//           System.out.println(++sum);
           System.out.println((x + y)+1);

       }

   }